package com.example.weatherapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.model.WeatherModel
import com.example.weatherapp.service.WeatherAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.ScheduledFuture

class MainViewModel: ViewModel(){

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
    }

}