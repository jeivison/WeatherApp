package com.example.weatherapp.repository

import com.example.weatherapp.service.WeatherAPIService

class MainRepository(private val weatherAPIService: WeatherAPIService){
    fun getWeather() = weatherAPIService.getWeather()
}


