package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class WeatherModel(
    val `by`: String,
    @SerializedName("execution_time")
    val executionTime: Double,
    @SerializedName("from_cache")
    val fromCache: Boolean,
    val results: Results,
    @SerializedName("valid_key")
    val validKey: Boolean
)