package com.example.api_viacep_project

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class CurrencyActivity : AppCompatActivity() {

    private lateinit var spinnerFrom: Spinner
    private lateinit var spinnerTo: Spinner
    private lateinit var btnConvert: Button
    private lateinit var txtResult: TextView
    private lateinit var btnVoltar: Button
    private val client = OkHttpClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)

        spinnerFrom = findViewById(R.id.spinnerFrom)
        spinnerTo = findViewById(R.id.spinnerTo)
        btnConvert = findViewById(R.id.btnConvert)
        txtResult = findViewById(R.id.txtResult)
        btnVoltar = findViewById(R.id.btnVoltar)

        val currencies = arrayOf("USD", "BRL", "EUR", "JPY")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, currencies)
        spinnerFrom.adapter = adapter
        spinnerTo.adapter = adapter

        btnConvert.setOnClickListener {
            val from = spinnerFrom.selectedItem.toString()
            val to = spinnerTo.selectedItem.toString()
            fetchConversion(from, to)
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }

    private fun fetchConversion(from: String, to: String) {
        // Endpoint correto para conversão
        val url = "https://api.exchangerate.host/convert?from=$from&to=$to&amount=1&access_key=a7b17877036fc35482dec028dfa502d6"

        val request = Request.Builder()
            .url(url)
            .addHeader("Authorization", "a7b17877036fc35482dec028dfa502d6")  // Adiciona o Access Key no cabeçalho
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread {
                    txtResult.text = "Erro ao buscar conversão"
                }
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    response.body()?.use { responseBody ->
                        // Pegue o JSON da resposta
                        val json = responseBody.string()

                        // Adiciona um log para verificar a resposta da API
                        Log.d("CurrencyResponse", "JSON: $json")  // Imprime o JSON no log para depuração

                        val jsonObj = JSONObject(json)

                        // Verifica se há um campo "error" indicando um problema na resposta
                        if (jsonObj.has("error")) {
                            val errorMessage = jsonObj.getJSONObject("error").getString("info")
                            runOnUiThread {
                                txtResult.text = "Erro: $errorMessage"
                            }
                        } else if (jsonObj.has("rates")) {
                            // Se "rates" está presente, pega a taxa de conversão
                            val rate = jsonObj.getJSONObject("rates").getDouble(to)
                            runOnUiThread {
                                txtResult.text = "1 $from = $rate $to"
                            }
                        } else {
                            // Caso a chave "rates" não seja encontrada
                            runOnUiThread {
                                txtResult.text = "Chave 'rates' não encontrada na resposta"
                            }
                        }
                    } ?: runOnUiThread {
                        txtResult.text = "Erro: resposta sem corpo"
                    }
                } else {
                    // Caso a resposta não seja bem-sucedida
                    runOnUiThread {
                        txtResult.text = "Erro na resposta da API"
                    }
                }
            }


        })
    }
}
