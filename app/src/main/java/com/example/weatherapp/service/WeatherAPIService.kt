package com.example.weatherapp.service

import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.CallAdapter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object WeatherAPIService {

    //https://api.hgbrasil.com/weather?woeid=455827

        val BASE_URL = "https://api.hgbrasil.com/"

        fun getInstance() : Retrofit{
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }


}