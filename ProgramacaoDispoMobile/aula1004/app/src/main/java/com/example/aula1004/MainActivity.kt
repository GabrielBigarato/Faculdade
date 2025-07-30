package com.example.aula1004

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate chamado")
    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart chamado")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart chamado")
    }
    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause chamado")
    }
    override fun onStop(){
        super.onStop()
        Log.d(TAG, "onStop chamado")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "onDestroy chamado")
    }
}