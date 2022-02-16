package com.example.weatherapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.model.WeatherModel
import com.example.weatherapp.service.WeatherAPI
import com.example.weatherapp.service.WeatherAPIService
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


class WeatherRepository {

    //private val apiInterface: WeatherAPI
   // private val waetherLiveData = MutableLiveData<WeatherModel>()
    private val weatherAPIService = WeatherAPIService
    private val disposable = CompositeDisposable()

    val waether_data = MutableLiveData<WeatherModel>()
    val waether_error = MutableLiveData<Boolean>()
    val waether_load = MutableLiveData<Boolean>()

    //val results : LiveData<WeatherModel>
    //get() = waetherLiveData


    /*
    fun getWeather(){
        val result = WeatherAPI.getWeather()
        if (result.body() != null){
            waetherLiveData.postValue(result.body())
        }
    }*/

    fun refreshData(){
        getDataFromAPI()
        //getDataFromLocal()
    }

    private fun getDataFromAPI() {
        waether_load.value = true
        disposable.add(
            weatherAPIService.getDataService()
                .

        )

    }

}