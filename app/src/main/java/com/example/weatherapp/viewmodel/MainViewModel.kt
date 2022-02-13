package com.example.weatherapp.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.model.WeatherModel
import com.example.weatherapp.service.WeatherAPIService
import io.reactivex.disposables.CompositeDisposable

class MainViewModel {

    private val weatherAPIService = WeatherAPIService()
    private val disposable = CompositeDisposable()

    val waether_data = MutableLiveData<WeatherModel>()
    val waether_error = MutableLiveData<Boolean>()
    val waether_load = MutableLiveData<Boolean>()

    fun refreshData(){
        getDataFromAPI()
        //getDataFromLocal()
    }

    private fun getDataFromAPI() {
        TODO("Not yet implemented")
    }

}