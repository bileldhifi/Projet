package com.example.ecocitoyen_frontend.ViewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.ecocitoyen_frontend.Models.Reclamation
import com.example.ecocitoyen_frontend.retrofit.ApiClient
import com.example.ecocitoyen_frontend.Services.ReclamationApi

class AllRecs : ViewModel () {
    /***************** AFFICHAGE BY ID USER *****************/
    var recLiveData: MutableLiveData<MutableList<Reclamation>?> = MutableLiveData()
    val _recLiveData : LiveData<MutableList<Reclamation>?> = recLiveData

    fun getAllRecsByUser_id(user_id: String){
        val retrofit= ApiClient.getApiClient()!!.create(ReclamationApi::class.java)
        val getBudget=retrofit.getAllByUser_id(user_id)
        getBudget.enqueue(object : Callback<MutableList<Reclamation>> {
            override fun onResponse(call: Call<MutableList<Reclamation>>, response: Response<MutableList<Reclamation>>) {
                if (response.isSuccessful){
                    recLiveData.postValue(response.body())
                }else{
                    Log.i("errorBody",  response.errorBody()!!.string())

                    recLiveData.postValue(response.body())
                }

            }

            override fun onFailure(call: Call<MutableList<Reclamation>>, t: Throwable) {
                recLiveData.postValue(null)
                Log.i("failure",  t.message.toString())
            }

        })
    }
    /***************** AFFICHAGE BY ID BUDGET *****************/
    var recLiveData1: MutableLiveData<Reclamation?> = MutableLiveData()
    val _recLiveData1 : LiveData<Reclamation?> = recLiveData1

    fun getRecById(id : String){
        val retrofit= ApiClient.getApiClient()!!.create(ReclamationApi::class.java)
        val getBudget=retrofit.getById(id)
        getBudget.enqueue(object : Callback<Reclamation> {
            override fun onResponse(call: Call<Reclamation>, response: Response<Reclamation>) {
                if (response.isSuccessful){
                    recLiveData1.postValue(response.body())
                }else{
                    Log.i("errorBody",  response.errorBody()!!.string())

                    recLiveData1.postValue(response.body())
                }

            }

            override fun onFailure(call: Call<Reclamation>, t: Throwable) {
                recLiveData1.postValue(null)
                Log.i("failure",  t.message.toString())
            }

        })

    }





}