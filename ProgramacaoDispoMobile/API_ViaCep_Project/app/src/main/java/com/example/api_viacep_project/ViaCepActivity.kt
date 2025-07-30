package com.example.api_viacep_project

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

class ViaCepActivity : AppCompatActivity() {

    private lateinit var edtCep: EditText
    private lateinit var btnBuscar: Button
    private lateinit var listView: ListView
    private val client = OkHttpClient()
    private val listItems = mutableListOf<String>()
    private lateinit var adapter: android.widget.ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viacep)

        edtCep = findViewById(R.id.edtCep)
        btnBuscar = findViewById(R.id.btnBuscar)
        listView = findViewById(R.id.listView)

        adapter = android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = adapter

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish() // Encerra a activity atual e volta pra anterior (MainActivity)
        }

        btnBuscar.setOnClickListener {
            val cep = edtCep.text.toString()
            if (cep.isNotEmpty()) {
                buscarCep(cep)
            } else {
                Toast.makeText(this, "Digite um CEP", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun buscarCep(cep: String) {
        val url = "https://viacep.com.br/ws/$cep/json/"
        val request = Request.Builder().url(url).build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread {
                    Toast.makeText(this@ViaCepActivity, "Erro ao buscar CEP", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onResponse(call: Call, response: Response) {
                response.body()?.use { responseBody ->
                    val json = responseBody.string()
                    val endereco = Gson().fromJson(json, Endereco::class.java)
                    val resultado = "${endereco.logradouro}, ${endereco.bairro}, ${endereco.localidade} - ${endereco.uf}"
                    runOnUiThread {
                        listItems.add(resultado)
                        adapter.notifyDataSetChanged()
                    }
                } ?: runOnUiThread {
                    Toast.makeText(this@ViaCepActivity, "Erro: resposta sem corpo", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
