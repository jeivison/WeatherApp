package com.example.weatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.R
import com.example.weatherapp.viewmodel.WeatherViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var viewModel: WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val apiInterface = WeatherAPIService.getInstance().create(WeatherAPI::class.java)

        //val weatherRepository = WeatherRepository(apiInterface)

        //viewModel = ViewModelProviders.of(this, factory)[MapViewModel::class.java]
        //viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)

        }
}
