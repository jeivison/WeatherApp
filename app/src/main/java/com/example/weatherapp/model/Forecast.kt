package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("condition")
    val condition: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("max")
    val max: Int,
    @SerializedName("min")
    val min: Int,
    @SerializedName("weekday")
    val weekday: String
)