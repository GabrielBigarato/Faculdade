package com.example.aula2703.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Gabriel Bigarato - RGM: 32831048"
    }
    val text: LiveData<String> = _text
}