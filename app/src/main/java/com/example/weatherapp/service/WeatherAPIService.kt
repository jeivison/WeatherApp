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

        val BASE_URL = "https://api.hgbrasil.com/"
        val api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(WeatherAPI::class.java)

    /*
        fun getInstance() : Retrofit{
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }*/

    fun getDataService(): Response<WeatherModel> {
        return api.getWeather()
    }


}