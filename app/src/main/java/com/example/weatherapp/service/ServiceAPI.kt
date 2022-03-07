package com.example.weatherapp.service

import com.example.weatherapp.model.Results
import com.example.weatherapp.model.WeatherData
import retrofit2.http.GET

interface ServiceAPI {
    //https://api.hgbrasil.com/weather?key=a30a6ec9

    @GET("/weather?key=a30a6ec9")
     suspend fun getServiceAPI() : WeatherData

}