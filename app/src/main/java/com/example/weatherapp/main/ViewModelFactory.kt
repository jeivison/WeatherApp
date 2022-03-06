package com.example.weatherapp.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.repository.MainRepository

class ViewModelFactory(
    private val repository: MainRepository
    )  : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WeatherViewModel(repository) as T
    }
}