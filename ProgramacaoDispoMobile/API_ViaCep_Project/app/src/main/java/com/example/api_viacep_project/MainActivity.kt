package com.example.api_viacep_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnViaCep = findViewById<Button>(R.id.btnViaCep)
        val btnCurrency = findViewById<Button>(R.id.btnCurrency)

        btnViaCep.setOnClickListener {
            startActivity(Intent(this, ViaCepActivity::class.java))
        }

        btnCurrency.setOnClickListener {
            startActivity(Intent(this, CurrencyActivity::class.java))
        }
    }
}
