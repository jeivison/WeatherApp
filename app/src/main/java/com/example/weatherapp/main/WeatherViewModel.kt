package com.example.weatherapp.main


import androidx.lifecycle.ViewModel
import com.example.weatherapp.model.Results
import com.example.weatherapp.repository.MainRepository
import retrofit2.Call
import retrofit2.Response


class WeatherViewModel constructor(private val repository: MainRepository) : ViewModel(){


        fun getWeather() {

            val request = repository.getWeather()
            request.enqueue(object : retrofit2.Callback<List<Results>> {
                override fun onResponse(
                    call: Call<List<Results>>,
                    response: Response<List<Results>>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<List<Results>>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
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

        }




