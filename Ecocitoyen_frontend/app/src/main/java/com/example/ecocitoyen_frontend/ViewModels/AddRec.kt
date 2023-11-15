package com.example.ecocitoyen_frontend.ViewModels



import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.ecocitoyen_frontend.Models.Reclamation
import com.example.ecocitoyen_frontend.Services.ReclamationApi
import com.example.ecocitoyen_frontend.retrofit.ApiClient


class AddRec : ViewModel() {
    var addReclamationLiveData : MutableLiveData<Reclamation?> = MutableLiveData()
    var _addReclamationLiveData : LiveData<Reclamation?> = addReclamationLiveData

    fun addBudget(rec: Reclamation){
        val retrofit = ApiClient.getApiClient()!!.create(ReclamationApi::class.java)

        val addTask = retrofit.AddRec(rec)
        addTask.enqueue(object : Callback<Reclamation>{
            override fun onResponse(call: Call<Reclamation>, response: Response<Reclamation>) {
                if (response.isSuccessful){
                    addReclamationLiveData.postValue(response.body())
                }else{
                    Log.i("errorBody", response.errorBody()!!.string())
                    addReclamationLiveData.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<Reclamation>, t: Throwable) {
                addReclamationLiveData.postValue(null)
                Log.i("failure", t.message.toString())
            }
        })
    }
}