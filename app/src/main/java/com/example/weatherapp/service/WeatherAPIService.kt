package com.example.weatherapp.service

import com.example.weatherapp.model.Results
import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.*
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface WeatherAPIService {
    //https://api.hgbrasil.com/weather?woeid=455827

    @GET("weather?woeid=455827")
    fun getWeather(): Call<List<Results>>

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

