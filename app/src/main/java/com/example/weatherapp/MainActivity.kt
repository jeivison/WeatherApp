package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.example.weatherapp.repository.WeatherRepository
import com.example.weatherapp.service.WeatherAPI
import com.example.weatherapp.service.WeatherAPIService
import com.example.weatherapp.viewmodel.WeatherViewModel
import retrofit2.create

class MainActivity : AppCompatActivity() {


    private lateinit var viewModel: WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = WeatherAPIService.getInstance().create(WeatherAPI::class.java)

        val weatherRepository = WeatherRepository(apiInterface)

        //viewModel = ViewModelProviders.of(this, factory)[MapViewModel::class.java]
        viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)

        }
}
