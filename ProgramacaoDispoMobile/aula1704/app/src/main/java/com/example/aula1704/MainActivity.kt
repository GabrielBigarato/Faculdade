package com.example.aula1704

import AulaDatabaseHelper
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
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

        val dbHelper = AulaDatabaseHelper(this)

        //insercao de turma
        dbHelper.inserirTurma(1, "Turma1", "CienciaComputacao", 10 )
        dbHelper.inserirTurma(2, "Turma2", "Analise Desenvolvimeto", 12 )
        dbHelper.inserirTurma(3, "Turma5", "CienciaComputacao", 40 )

        val listView: ListView = findViewById(R.id.listTeste)
        val dados = mutableListOf<String>()

        //Listando alunos
        val turmas = dbHelper.listarTurma()
        for (turma in turmas) {
            val linha = "${turma.id} - ${turma.tituloTurma} - ${turma.curso} - ${turma.qtd_aluno}"
            dados.add(linha)
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)

        listView.setAdapter(adapter)



    }
}