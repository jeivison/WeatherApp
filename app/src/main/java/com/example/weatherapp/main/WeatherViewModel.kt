package com.example.weatherapp.main


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.model.Results
import com.example.weatherapp.model.WeatherData
import com.example.weatherapp.repository.MainRepository
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch



class WeatherViewModel constructor(private val repository: MainRepository) : ViewModel(){

        val resultsLiveData = MutableLiveData<WeatherData>()
        //val errorMessage = MutableLiveData<String>()

        fun getWeather() {
            viewModelScope.launch{
                val response = repository.getWeather()
                resultsLiveData.postValue(response)
            }

            /*
            val request = repository.getWeather()
                request.enqueue(object : Callback<List<WeatherModel>> {
                override fun onResponse(call: Call<List<WeatherModel>>, response: Response<List<WeatherModel>>) {
                    //Quando houver uma repost
                    resultsLiveData.postValue(response.body())
                }
                override fun onFailure(call: Call<List<WeatherModel>>, t: Throwable) {
                    errorMessage.postValue(t.message)
                }

            })
        }*/
        }
}




/*
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
*/




