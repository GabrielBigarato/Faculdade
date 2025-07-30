package com.example.aula2703.ui.computacao

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ComputacaoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este fragmento é Ciencia da Computação"
    }
    val text: LiveData<String> = _text
}