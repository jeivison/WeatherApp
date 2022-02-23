package com.example.weatherapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.main.MainViewModelFactory
import com.example.weatherapp.main.WeatherViewModel
import com.example.weatherapp.repository.MainRepository
import com.example.weatherapp.service.WeatherAPIService
import retrofit2.http.GET


class MainActivity : AppCompatActivity() {

    lateinit var viewmodel : WeatherViewModel

    private val weatherService = WeatherAPIService.getInstance()

   private lateinit var GET : SharedPreferences
   //private lateinit var SET: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GET = getSharedPreferences(packageName, MODE_PRIVATE)

       viewmodel = ViewModelProvider(this, MainViewModelFactory(MainRepository(weatherService))).get(
            WeatherViewModel::class.java
        )

        viewmodel.getWeather()

        getLiveData()

        }

    val address = findViewById<TextView>(R.id.a_ddress)
   // val mainContainer = findViewById<View>(R.id.mainContainer)

    private fun getLiveData() {
        viewmodel.resultsLiveData.observe(this, Observer {
            address.text = it.toString()
    })

    }
}
