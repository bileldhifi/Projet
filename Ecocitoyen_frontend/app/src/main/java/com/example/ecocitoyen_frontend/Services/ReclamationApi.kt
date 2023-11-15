package com.example.ecocitoyen_frontend.Services


import retrofit2.Call
import retrofit2.http.*

import com.example.ecocitoyen_frontend.Models.Reclamation

interface ReclamationApi {
    @GET("/api/reclamations/get/{user_id}")
    fun getAllByUser_id(
        @Path("user_id") user_id: String,
    ): Call<MutableList<Reclamation>>

    @GET("/api/reclamations/{id}")
    fun getById(
        @Path("id") id : String,
    ): Call<Reclamation>

    @POST("/api/reclamations/store")
    fun AddRec(
        @Body reclamation: Reclamation
    ): Call<Reclamation>



    @DELETE("/api/reclamations/delete/{idbudget}")
    fun DeleteRec(
        @Path("idbudget") idbudget: String,
    ): Call<String>

}