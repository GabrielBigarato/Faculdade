package com.example.projetoapi

data class ExchangeRateResponse(
    val rates: Map<String, Double> // Mapa com pares de moeda e suas cotações (ex: "BRL": 5.12)
)