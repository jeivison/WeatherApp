package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class Forecast(
    val condition: String,
    val date: String,
    val description: String,
    val max: Int,
    val min: Int,
    val weekday: String
)
