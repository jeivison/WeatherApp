package com.example.weatherapp.service

import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory


object WeatherAPIService {

        const val BASE_URL = "https://api.hgbrasil.com"

        private val retrofit  by lazy {
                 Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        }

        val api : ServiceAPI by lazy {
            retrofit.create(ServiceAPI::class.java)
        }

}

