package com.example.weatherapp.service

import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.CallAdapter
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class WeatherAPIService {
    //https://api.hgbrasil.com/weather?woeid=455827

    companion object {

        private val WeatherAPIService : WeatherAPIService by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.hgbrasil.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            retrofit.create(WeatherAPIService::class.java)
        }


        fun getDataService(): WeatherAPIService {
            return WeatherAPIService
        }


    }
}

