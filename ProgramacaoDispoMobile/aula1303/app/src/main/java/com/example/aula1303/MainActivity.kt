package com.example.aula1303

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun visualizarDados(view: View){

        //referencia a textview onde o resultado vai ser exibido
        val resultadoTextView: TextView = findViewById(R.id.textViewResultado)

        //para exibir o nome
        val nomeEditado: EditText = findViewById(R.id.editNome)
        val nome = nomeEditado.text.toString()
        //Toast.makeText(this, ""+nomeEditado.text.toString(), Toast.LENGTH_LONG).show()

        //para exibir o genero
        val radioGroupGen: RadioGroup = findViewById(R.id.rqGenero)

        val idSelecionado = radioGroupGen.checkedRadioButtonId

        val genero = if(idSelecionado != -1){
            val selectedRadioButton: RadioButton = findViewById(idSelecionado)
            selectedRadioButton.text.toString()
            //Toast.makeText(this, ""+selectedRadioButton.text,Toast.LENGTH_LONG).show()
        }
        else {
            "Escolha o gênero"
            //Toast.makeText(this, "Escolha p genero", Toast.LENGTH_LONG).show()
        }

    //para o spinner
        val spinner: Spinner = findViewById(R.id.spinnerEstado)
        //obter a posicao selecionada no spinner
        val selectedPosition = spinner.selectedItemPosition
        //obter o valor selecionado
        val selectedItem = spinner.getItemAtPosition(selectedPosition).toString()

        //Toast.makeText(this, "Estado: "+selectedItem, Toast.LENGTH_LONG).show()

    //para o checkbox
//        val valCheckBoxPassear: CheckBox = findViewById(R.id.checkboxPassear)
//
//        val passear = if(valCheckBoxPassear.isChecked){
//            //Toast.makeText(this, valCheckBoxPassear.text.toString(),Toast.LENGTH_LONG).show()
//            valCheckBoxPassear.text.toString()
//        }
//        else{
//            "Nao gosta de passear"
//            //Toast.makeText(this,"Nao gosta de passear", Toast.LENGTH_LONG).show()
//        }

        // Verificar quais CheckBoxes estão selecionadas
        val selectedActivities = mutableListOf<String>()

        val valCheckBoxPassear: CheckBox = findViewById(R.id.checkboxPassear)
        if (valCheckBoxPassear.isChecked) {
            selectedActivities.add(valCheckBoxPassear.text.toString())
        }

        val valCheckBoxCinema: CheckBox = findViewById(R.id.checkboxCinema)
        if (valCheckBoxCinema.isChecked) {
            selectedActivities.add(valCheckBoxCinema.text.toString())
        }

        val valCheckBoxFutebol: CheckBox = findViewById(R.id.checkboxFutebol)
        if (valCheckBoxFutebol.isChecked) {
            selectedActivities.add(valCheckBoxFutebol.text.toString())
        }

        // Se nenhuma atividade foi selecionada, exibe "Não selecionou atividades"
        val atividades = if (selectedActivities.isNotEmpty()) {
            selectedActivities.joinToString(", ")
        } else {
            "Não selecionou atividades"
        }

        //atualizando a textview com as escolhas do usuario
        val resultado = """
            Nome: $nome
            Genero: $genero 
            Estado: $selectedItem
            Passeio: $atividades
        """.trimIndent()

        resultadoTextView.text = resultado
    }
}