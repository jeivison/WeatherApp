package com.example.weatherapp.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.model.WeatherModel
import com.example.weatherapp.service.WeatherAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.internal.schedulers.NewThreadScheduler
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import java.util.*


class WeatherViewModel{

    //private val apiInterface: WeatherAPI
    // private val waetherLiveData = MutableLiveData<WeatherModel>()
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
        waether_load.value = true
        disposable.add(
            weatherAPIService.getDataService()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribewith(object: DisposableSingleObserver<WeatherModel>())


        )


    }

}




