package com.example.aula2703.ui.imc

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ImcViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Calculdora de IMC"
    }
    val text: LiveData<String> = _text
}