package com.example.mmmmmmmmmmm.Repository

import com.example.mmmmmmmmmmm.Model.Location
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("getall")
        fun getPost(): Call<List<Location>>
}