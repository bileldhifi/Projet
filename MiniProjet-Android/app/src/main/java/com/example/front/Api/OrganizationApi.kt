package com.example.front.Api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST

import retrofit2.http.Multipart

interface OrganizationApi {
    @Headers("Content-Type: application/json")
    @GET("/organization")
    fun listOrganization(): Call<JsonObject>


    @Multipart
    @POST("/organization/store")

    fun addOrganization( @Body body: JsonObject ): Call<JsonObject>




}