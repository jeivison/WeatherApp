package com.example.weatherapp.model


import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("cid")
    val cid: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("city_name")
    val cityName: String,
    @SerializedName("condition_code")
    val conditionCode: String,
    @SerializedName("condition_slug")
    val conditionSlug: String,
    @SerializedName("currently")
    val currently: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("forecast")
    val forecast: List<Forecast>,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("img_id")
    val imgId: String,
    @SerializedName("sunrise")
    val sunrise: String,
    @SerializedName("sunset")
    val sunset: String,
    @SerializedName("temp")
    val temp: Int,
    @SerializedName("time")
    val time: String,
    @SerializedName("wind_speedy")
    val windSpeedy: String
)