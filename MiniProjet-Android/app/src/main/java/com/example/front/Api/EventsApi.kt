package com.example.front.Api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST

import retrofit2.http.Multipart

interface EventsApi {
    @Headers("Content-Type: application/json")
    @GET("/events")
    fun listEvents(): Call<JsonObject>


    @Multipart
    @POST("/events/store")

    fun addEvents( @Body body: JsonObject ): Call<JsonObject>




}