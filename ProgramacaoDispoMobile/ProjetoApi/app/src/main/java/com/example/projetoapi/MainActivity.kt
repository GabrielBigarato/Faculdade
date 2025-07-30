package com.example.projetoapi

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    // Declaramos os elementos da interface gráfica (TextViews, ImageView e Botões)
    private lateinit var weatherResult: TextView // Exibe o resultado da API de clima
    private lateinit var rateResult: TextView // Exibe o resultado da API de cotação
    private lateinit var catImage: ImageView // Exibe a imagem do gato
    private lateinit var btnWeather: Button // Botão para buscar o clima
    private lateinit var btnRate: Button // Botão para buscar a cotação
    private lateinit var btnCat: Button // Botão para buscar imagem de gato

    // Chave de acesso à API do OpenWeatherMap (deve ser substituída pela sua chave válida)
    private val apiKey = "aec4b684ff1217da156cda7379638ef0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define qual layout será usado

        // Conectamos os elementos do XML com as variáveis do Kotlin
        weatherResult = findViewById(R.id.weatherResult)
        rateResult = findViewById(R.id.rateResult)
        catImage = findViewById(R.id.catImage)
        btnWeather = findViewById(R.id.btnWeather)
        btnRate = findViewById(R.id.btnRate)
        btnCat = findViewById(R.id.btnCat)

        // Quando o botão do clima for clicado
        btnWeather.setOnClickListener {
            val city = "São Paulo" // Define a cidade para buscar o clima

            // Faz a chamada para a API do clima usando Retrofit
            RetrofitClient.weatherApi.getWeather(city, apiKey)
                .enqueue(object : Callback<WeatherResponse> {
                    override fun onResponse(
                        call: Call<WeatherResponse>,
                        response: Response<WeatherResponse>
                    ) {
                        // Quando a resposta for recebida com sucesso
                        val body = response.body() // Pegamos o corpo da resposta (WeatherResponse)
                        val temp = body?.main?.temp // Pegamos a temperatura
                        val name = body?.name // Pegamos o nome da cidade
                        weatherResult.text =
                            "Cidade: $name\nTemperatura: $temp°C" // Mostramos na tela
                    }

                    override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                        // Quando houver erro na chamada da API
                        weatherResult.text = "Erro ao buscar clima"
                    }
                })
        }

        // Quando o botão da cotação for clicado
        btnRate.setOnClickListener {
            // Faz a chamada para a API de cotação usando Retrofit
            RetrofitClient.rateApi.getExchangeRates()
                .enqueue(object : Callback<ExchangeRateResponse> {
                    override fun onResponse(
                        call: Call<ExchangeRateResponse>,
                        response: Response<ExchangeRateResponse>
                    ) {
                        val rates = response.body()?.rates // Pegamos o mapa de moedas
                        val usdToBrl = rates?.get("BRL") // Dólar para Real
                        val eurToBrl = rates?.get("EUR") // Euro para Real
                        rateResult.text =
                            "USD -> BRL: $usdToBrl\nEUR -> BRL: $eurToBrl" // Mostramos na tela
                    }

                    override fun onFailure(call: Call<ExchangeRateResponse>, t: Throwable) {
                        // Quando houver erro na chamada da API
                        rateResult.text = "Erro ao buscar cotação"
                    }
                })
        }

        // Quando o botão do gato for clicado
        btnCat.setOnClickListener {
            // Faz a chamada para a API de imagem de gato usando Retrofit
            RetrofitClient.catApi.getRandomCat().enqueue(object : Callback<List<Cat>> {
                override fun onResponse(call: Call<List<Cat>>, response: Response<List<Cat>>) {
                    val imageUrl = response.body()?.firstOrNull()?.url // Pegamos a URL da imagem
                    // Usamos Glide para carregar a imagem no ImageView
                    Glide.with(this@MainActivity).load(imageUrl).into(catImage)
                }

                override fun onFailure(call: Call<List<Cat>>, t: Throwable) {
                    // Mostramos um Toast se der erro
                    Toast.makeText(this@MainActivity, "Erro ao carregar imagem", Toast.LENGTH_SHORT)
                        .show()
                }
            })
        }
    }
}
