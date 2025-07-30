package com.example.projetoapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    // API de clima (OpenWeatherMap)
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city: String,         // Nome da cidade
        @Query("appid") apiKey: String,   // Chave da API
        @Query("units") units: String = "metric" // Unidade (métrica = Celsius)
    ): Call<WeatherResponse>

    // API de cotação (ExchangeRate.host)
    @GET("latest?base=USD")
    fun getExchangeRates(): Call<ExchangeRateResponse>

    // API de imagem de gatos (The Cat API)
    @GET("v1/images/search")
    fun getRandomCat(): Call<List<Cat>>
}