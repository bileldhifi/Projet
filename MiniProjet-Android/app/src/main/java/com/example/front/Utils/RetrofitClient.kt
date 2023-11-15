package com.example.front.Utils

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//("http://10.0.2.2:3000/")
class RetrofitClient {

    var BASE_URL = "http:///10.0.2.2:3000/"

    fun getRetroClinetInstance() : Retrofit{

        val gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    }
}