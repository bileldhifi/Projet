package com.example.mmmmmmmmmmm.Repository

import com.example.mmmmmmmmmmm.Model.Location
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("getall")
        fun getPost(): Call<List<Location>>
    @POST("create")
    fun addLocation(@Body locationData: Location): Call<Location> // Replace ResponseType with your actual response class

}