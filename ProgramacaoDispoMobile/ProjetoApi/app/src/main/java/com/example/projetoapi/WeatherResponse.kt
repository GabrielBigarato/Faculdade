package com.example.projetoapi

data class WeatherResponse(
    val name: String, // Nome da cidade
    val main: Main // Objeto 'main' dentro do JSON, com temperatura
)

data class Main(
    val temp: Double // Temperatura atual em graus Celsius
)