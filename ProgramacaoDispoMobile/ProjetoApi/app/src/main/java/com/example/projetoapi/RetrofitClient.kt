package com.example.projetoapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    // Instância da API de Clima
    val weatherApi: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/") // URL base da OpenWeatherMap
            .addConverterFactory(GsonConverterFactory.create()) // Converte JSON em objetos Kotlin
            .build()
            .create(ApiService::class.java)
    }

    // Instância da API de Cotação
    val rateApi: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.exchangerate.host/") // URL base da ExchangeRate
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    // Instância da API de Gatos
    val catApi: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com/") // URL base da TheCatAPI
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}