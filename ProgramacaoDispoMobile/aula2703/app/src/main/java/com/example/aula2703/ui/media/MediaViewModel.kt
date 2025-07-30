package com.example.aula2703.ui.media

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MediaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Calcular Média 3 Alunos"
    }
    val text: LiveData<String> = _text
}