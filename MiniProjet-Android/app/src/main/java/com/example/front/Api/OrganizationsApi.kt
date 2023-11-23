package com.example.front.Api

import com.example.front.data.ListOrganizations
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST

import retrofit2.http.Multipart

interface OrganizationsApi {
    @Headers("Content-Type: application/json")
    @GET("/organizations")
    fun listOrganizations(): Call<JsonObject>





}