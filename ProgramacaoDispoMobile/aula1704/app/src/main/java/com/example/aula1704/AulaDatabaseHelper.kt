import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues
import com.example.aula1704.Turma

//import com.example.sqliteexemplo.Turma

class AulaDatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, "dbTurma", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS tbTurma (id INTEGER PRIMARY KEY, tituloTurma TEXT, curso TEXT, qtd_aluno INTEGER)")
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS tbTurma")
        onCreate(db)
    }
    fun inserirTurma(id: Int, tituloTurma: String, curso: String, qtd_aluno: Int) {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("id", id)
            put("tituloTurma", tituloTurma)
            put("curso", curso)
            put("qtd_aluno", qtd_aluno)
        }
        db.insert("tbTurma", null, values)
        db.close()
    }
    fun listarTurma(): List<Turma> {
        val lista = mutableListOf<Turma>()
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM tbTurma", null)

        val colunaId = cursor.getColumnIndex("id")
        val colunaTitulo = cursor.getColumnIndex("tituloTurma")
        val colunaCurso = cursor.getColumnIndex("curso")
        val colunaQtdAluno = cursor.getColumnIndex("qtd_aluno")

        if (cursor.moveToFirst()) {
            do {
                val turma = Turma(
                    id = cursor.getInt(colunaId),
                    tituloTurma = cursor.getString(colunaTitulo),
                    curso = cursor.getString(colunaCurso),
                    qtd_aluno = cursor.getInt(colunaQtdAluno)

                )
                lista.add(turma)
            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return lista
    }
}