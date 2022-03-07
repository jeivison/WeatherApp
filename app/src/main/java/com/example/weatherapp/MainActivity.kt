package com.example.weatherapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.main.ViewModelFactory
import com.example.weatherapp.main.WeatherViewModel
import com.example.weatherapp.repository.MainRepository


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: WeatherViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = MainRepository()
        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(WeatherViewModel::class.java)
        viewModel.getWeather()
        getLiveData()

        }


    private fun getLiveData() {
        viewModel.resultsLiveData.observe(this) { resultado ->
            binding.apply {
                address.text = resultado.results.city
                updatedAt.text = resultado.results.date
                temp.text = "${resultado.results.temp}°C"
                status.text = resultado.results.description
                sunrise.text = resultado.results.sunrise
                sunset.text = resultado.results.sunset
                wind.text = resultado.results.windSpeedy
                pressure.text = resultado.results.imgId
                humidity.text = resultado.results.humidity.toString()

                val forecast1 = resultado.results.forecast[0]
                val forecast2 = resultado.results.forecast[1]
                tempMax.text = "Max: ${forecast1.max}"
                tempMin.text = "Min: ${forecast2.min}"

            }
        }
    }
}
