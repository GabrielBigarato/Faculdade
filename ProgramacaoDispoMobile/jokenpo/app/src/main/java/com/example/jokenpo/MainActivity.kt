package com.example.jokenpo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private val choices = arrayOf("Pedra", "Papel", "Tesoura")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tvResult)

        val btnPedra = findViewById<Button>(R.id.btnPedra)
        val btnPapel = findViewById<Button>(R.id.btnPapel)
        val btnTesoura = findViewById<Button>(R.id.btnTesoura)

        btnPedra.setOnClickListener { play("Pedra") }
        btnPapel.setOnClickListener { play("Papel") }
        btnTesoura.setOnClickListener { play("Tesoura") }
    }

    private fun play(userChoice: String) {
        val botChoice = choices[Random.nextInt(choices.size)]
        val result = getResult(userChoice, botChoice)
        tvResult.text = "Você: $userChoice\nBOT: $botChoice\nResultado: $result"
    }

    private fun getResult(user: String, bot: String): String {
        return if (user == bot) {
            "Empate!"
        } else if ((user == "Pedra" && bot == "Tesoura") ||
            (user == "Papel" && bot == "Pedra") ||
            (user == "Tesoura" && bot == "Papel")) {
            "Você ganhou!"
        } else {
            "Você perdeu!"
        }
    }
}