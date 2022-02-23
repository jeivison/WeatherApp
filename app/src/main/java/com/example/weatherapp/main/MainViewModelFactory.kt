package com.example.weatherapp.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.repository.MainRepository

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory constructor(private val repository: MainRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModelFactory::class.java)){
            MainViewModelFactory(this.repository) as T
        } else{
            throw IllegalAccessException("ViewModel Not Found")
        }
    }
}