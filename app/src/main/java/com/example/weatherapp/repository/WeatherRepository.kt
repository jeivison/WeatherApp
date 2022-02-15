package com.example.weatherapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.model.WeatherModel
import com.example.weatherapp.service.WeatherAPI


class WeatherRepository(private val apiInterface: WeatherAPI){

    private val waetherLiveData = MutableLiveData<WeatherModel>()

    val results : LiveData<WeatherModel>
    get() = waetherLiveData

    fun getWeather(){
        val result = WeatherAPI.getWeather()
        if (result.body() != null){
            waetherLiveData.postValue(result.body())
        }
    }













    /*
    fun refreshData(){
        getDataFromAPI()
        //getDataFromLocal()
    }

    private fun getDataFromAPI() {

        waether_load.value = true
        disposable.add(
            weatherAPIService.getDataService()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<WeatherModel>(){
                    override fun onSuccess(t: WeatherModel) {
                        waether_data.value = t
                        waether_error.value = false
                        waether_load.value = false
                    }

                    override fun onError(e: Throwable) {
                        waether_error.value = true
                        waether_load.value = false
                    }

                })
        )
    }*/

}