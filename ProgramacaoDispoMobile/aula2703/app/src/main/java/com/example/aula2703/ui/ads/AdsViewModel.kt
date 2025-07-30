package com.example.aula2703.ui.ads

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class AdsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este fragmento é Analise Desenvolvimento de Sistemas"
    }
    val text: LiveData<String> = _text
}