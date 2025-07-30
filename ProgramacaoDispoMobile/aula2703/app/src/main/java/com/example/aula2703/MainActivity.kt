package com.example.aula2703

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.aula2703.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_contato, R.id.nav_computacao, R.id.nav_ads, R.id.nav_imc, R.id.nav_media
            ), drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_sair ->{
                finishAffinity()
                System.exit(0)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun calcularImc (view: View){
        val resultadoTextView: TextView = findViewById(R.id.resultadoImc)

        val editPeso: EditText = findViewById(R.id.editPeso)

        val editAltura: EditText = findViewById(R.id.editAltura)

        val buttonCalcular: Button = findViewById(R.id.buttonCalcularImc)

        buttonCalcular.setOnClickListener{
            val peso = editPeso.text.toString().replace(",", ".").toDoubleOrNull()
            val altura = editAltura.text.toString().replace(",", ".").toDoubleOrNull()

            if(peso == null || altura == null || altura <= 0){
                resultadoTextView.text = "Por Favor, insira valores válidos."
                return@setOnClickListener
            }
            val imc = peso / (altura * altura)
            val categoriaImc = when {
                imc < 18.5 -> "Abaixo do peso"
                imc in 18.5..24.9 -> "Peso normal"
                imc in 25.0..29.9 -> "Sobrepeso"
                imc in 30.0..34.9 -> "Obesidade grau 1"
                imc in 35.0..39.9 -> "Obesidade grau 2"
                else -> "Obesidade grau 3 (obesidade mórbida)"
            }

            resultadoTextView.text = "Seu IMC é: %.2f\nCategoria: $categoriaImc".format(imc)

        }
    }

    fun calcularMedia (view: View){
        val editNota1: EditText = findViewById(R.id.editNota1)
        val editNota2: EditText = findViewById(R.id.editNota2)
        val editNota3: EditText = findViewById(R.id.editNota3)
        val resultadoMediaTextView: TextView = findViewById(R.id.resultadoMedia)
        val buttonCalcularMedia: Button = findViewById(R.id.buttonCalcularMedia)

        buttonCalcularMedia.setOnClickListener{
            val nota1 = editNota1.text.toString().toDouble()
            val nota2 = editNota2.text.toString().toDouble()
            val nota3 = editNota3.text.toString().toDouble()

            val media = (nota1 + nota2 + nota3)/3

            if (media >= 6){
                resultadoMediaTextView.text = "Aprovado - Média: %.2f". format(media)
            } else{
                resultadoMediaTextView.text = "Reprovado - Média: %.2f".format(media)
            }
        }
    }
}