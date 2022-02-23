package com.example.weatherapp.main


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.repository.MainRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class WeatherViewModel constructor(private val repository: MainRepository) : ViewModel(){

        val resultsLiveData = MutableLiveData<List<WeatherModel>>()
        val errorMessage = MutableLiveData<String>()

        fun getWeather() {

            val request = repository.getWeather()
            request.enqueue(object : Callback<List<WeatherModel>> {
                override fun onResponse(call: Call<List<WeatherModel>>,response: Response<List<WeatherModel>>) {
                    //Quando houver uma resposta
                    resultsLiveData.postValue(response.body())
                }

                override fun onFailure(call: Call<List<WeatherModel>>, t: Throwable) {
                    errorMessage.postValue(t.message)
                }
            })
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




