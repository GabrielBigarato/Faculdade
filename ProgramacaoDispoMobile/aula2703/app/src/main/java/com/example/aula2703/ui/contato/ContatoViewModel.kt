package com.example.aula2703.ui.contato

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContatoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este fragmento é Contatos"
    }
    val text: LiveData<String> = _text
}