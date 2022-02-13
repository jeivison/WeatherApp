package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class Results(
    val cid: String,
    val city: String,
    @SerializedName("city_name")
    val cityName: String,
    @SerializedName("condition_code")
    val conditionCode: String,
    @SerializedName("condition_slug")
    val conditionSlug: String,
    val currently: String,
    val date: String,
    val description: String,
    val forecast: List<Forecast>,
    val humidity: Int,
    @SerializedName("img_id")
    val imgId: String,
    val sunrise: String,
    val sunset: String,
    val temp: Int,
    val time: String,
    @SerializedName("wind_speedy")
    val windSpeedy: String
)