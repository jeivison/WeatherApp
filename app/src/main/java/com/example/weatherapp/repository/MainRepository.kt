package com.example.weatherapp.repository

import com.example.weatherapp.service.WeatherAPI

class MainRepository constructor(private val weatherAPI: WeatherAPI){
    fun getWeather() = weatherAPI.getWeather()
}


