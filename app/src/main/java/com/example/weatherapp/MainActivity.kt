package com.example.weatherapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.main.ViewModelFactory
import com.example.weatherapp.main.WeatherViewModel
import com.example.weatherapp.repository.MainRepository




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewmodel : WeatherViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = MainRepository()
        val viewModelFactory = ViewModelFactory(repository)
        viewmodel = ViewModelProvider(this, viewModelFactory).get(WeatherViewModel::class.java)
        viewmodel.getWeather()
        getLiveData()

        }


    private fun getLiveData() {
        viewmodel.resultsLiveData.observe(this) { resultado ->
            binding.apply {
                address.text = resultado.results.cityName
                temp.text = resultado.results.temp.toString()
                //Log.d("Resultado", resultado)
            }
        }
    }
}
