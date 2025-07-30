package com.example.aula1004_bd

// Importações necessárias
import android.database.sqlite.SQLiteException // Para tratamento de erros de banco
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Variáveis que vão se conectar com os elementos da interface (tela)
    private lateinit var edtNome: EditText
    private lateinit var edtTelefone: EditText
    private lateinit var btnSalvar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout da tela principal (activity_main.xml)
        setContentView(R.layout.activity_main)

        // Configura as margens para não cobrir barra de status ou navegação
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Conectando as variáveis com os elementos da interface
        edtNome = findViewById(R.id.edtNome)               // Campo de texto para nome
        edtTelefone = findViewById(R.id.edtTelefone)       // Campo de texto para telefone
        btnSalvar = findViewById(R.id.btnSalvar)           // Botão "Salvar no BD"
        txtResultado = findViewById(R.id.txtResultado)     // Área de texto para mostrar resultados

        try {
            // Cria ou abre um banco de dados local chamado "dbAula"
            val bancoDeDados = openOrCreateDatabase("dbAula", MODE_PRIVATE, null)

            // Cria a tabela "tbAluno" caso ainda não exista
            bancoDeDados.execSQL(
                "CREATE TABLE IF NOT EXISTS tbAluno(" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " + // ID gerado automaticamente
                        "nome VARCHAR, " +                         // Nome do aluno
                        "telefone VARCHAR)"                        // Telefone do aluno
            )

            // Quando o botão for clicado, vamos inserir o aluno no banco
            btnSalvar.setOnClickListener {
                val nome = edtNome.text.toString()           // Pegando texto do campo nome
                val telefone = edtTelefone.text.toString()   // Pegando texto do campo telefone

                // Verifica se os dois campos estão preenchidos
                if (nome.isNotBlank() && telefone.isNotBlank()) {
                    try {
                        // Insere os dados no banco
                        bancoDeDados.execSQL(
                            "INSERT INTO tbAluno (nome, telefone) VALUES ('$nome', '$telefone')"
                        )

                        // Limpa os campos depois de salvar
                        edtNome.text.clear()
                        edtTelefone.text.clear()

                        // Atualiza o resultado na tela com os dados mais recentes
                        mostrarAlunos(bancoDeDados)

                    } catch (e: SQLiteException) {
                        // Se der erro ao inserir, mostra no Logcat
                        Log.e("ErroInsert", "Erro ao inserir: ${e.message}")
                    }
                } else {
                    // Se algum campo estiver vazio, avisa o usuário
                    txtResultado.text = "Preencha todos os campos!"
                }
            }

            // Ao abrir o app, já mostra os alunos cadastrados
            mostrarAlunos(bancoDeDados)

        } catch (e: SQLiteException) {
            // Se não conseguir criar ou acessar o banco, mostra o erro no Logcat
            Log.e("ErroBD", "Erro ao acessar o banco: ${e.message}")
        }
    }

    // Função que busca os dados da tabela e exibe no TextView
    private fun mostrarAlunos(banco: android.database.sqlite.SQLiteDatabase) {
        try {
            // Comando SQL para buscar todos os alunos
            val cursor = banco.rawQuery("SELECT * FROM tbAluno", null)

            // Pegando os índices das colunas
            val idIndex = cursor.getColumnIndex("id")
            val nomeIndex = cursor.getColumnIndex("nome")
            val telefoneIndex = cursor.getColumnIndex("telefone")

            // StringBuilder para montar o texto de saída
            val resultado = StringBuilder()

            // Move o cursor para o primeiro registro
            cursor.moveToFirst()

            // Enquanto houver dados no cursor
            while (!cursor.isAfterLast) {
                val id = cursor.getInt(idIndex)                       // Lê o ID
                val nome = cursor.getString(nomeIndex)                // Lê o nome
                val telefone = cursor.getString(telefoneIndex)        // Lê o telefone

                // Adiciona esses dados ao resultado
                resultado.append("ID: $id\nNome: $nome\nTelefone: $telefone\n\n")

                // Move para o próximo registro
                cursor.moveToNext()
            }

            // Fecha o cursor para liberar recursos
            cursor.close()

            // Mostra os dados no TextView
            txtResultado.text = resultado.toString()

        } catch (e: Exception) {
            // Se der erro na consulta, avisa no TextView e no Logcat
            txtResultado.text = "Erro ao consultar os dados."
            Log.e("ErroConsulta", e.message ?: "Erro desconhecido")
        }
    }
}