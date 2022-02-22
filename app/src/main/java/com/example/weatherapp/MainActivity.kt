package com.example.weatherapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.main.MainViewModelFactory
import com.example.weatherapp.main.WeatherViewModel
import com.example.weatherapp.repository.MainRepository
import com.example.weatherapp.service.WeatherAPIService
import retrofit2.http.GET


class MainActivity : AppCompatActivity() {

    lateinit var viewModel : WeatherViewModel

    private val weatherService = WeatherAPIService.getDataService()

    private lateinit var GET: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       GET = getSharedPreferences(packageName, MODE_PRIVATE)

       viewModel = ViewModelProvider(this, MainViewModelFactory(MainRepository(weatherService))).get(
            WeatherViewModel::class.java
        )





        }
}
