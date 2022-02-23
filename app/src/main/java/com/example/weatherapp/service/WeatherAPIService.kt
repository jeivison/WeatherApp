package com.example.weatherapp.service

import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface WeatherAPIService {
    //https://api.hgbrasil.com/weather?woeid=455827
    //https://api.hgbrasil.com/weather?key=a30a6ec9

    @GET("/weather?key=a30a6ec9")
    fun getWeather(): Call<List<WeatherModel>>

    companion object {

        private val WeatherAPIService : WeatherAPIService by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.hgbrasil.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            retrofit.create(WeatherAPIService::class.java)
        }

        fun getInstance(): WeatherAPIService{
            return WeatherAPIService
        }

    }
}

