package com.example.ecocitoyen_frontend.retrofit

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory





class ApiClient {
    companion object{
        val URL ="http://192.168.1.18:8088"
        //val URL ="http://10.0.2.2:9092/"
        //val URL="https://moody-kiwis-wear-196-203-207-178.loca.lt"
        var retrofitToken: Retrofit? = null

        fun getApiClientWithToken(context: Context): Retrofit? {
            if (retrofitToken == null) {
                val client =  OkHttpClient.Builder()

                    .build()
                retrofitToken = Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofitToken
        }

        var retrofit: Retrofit? = null
        fun getApiClient(): Retrofit? {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }

    }
}