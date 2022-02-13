package com.example.weatherapp.service

import com.example.weatherapp.model.WeatherModel
import com.google.android.material.datepicker.SingleDateSelector
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET




interface WeatherAPI {

    @GET("weather?woeid=455827")
    fun getData(): Single<WeatherModel>

}