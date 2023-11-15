package com.example.ecocitoyen_frontend.Services


import retrofit2.Call
import retrofit2.http.*

import com.example.ecocitoyen_frontend.Models.Reclamation

interface ReclamationApi {
    @GET("reclamations/get/{user_id}")
    fun getAllByUser_id(
        @Path("user_id") user_id: String,
    ): Call<MutableList<Reclamation>>

    @GET("reclamations/{id}")
    fun getById(
        @Path("id") id : String,
    ): Call<Reclamation>

    @POST("reclamation")
    fun AddRec(
        @Body reclamation: Reclamation
    ): Call<Reclamation>



    @DELETE("reclamations/delete/{idbudget}")
    fun DeleteRec(
        @Path("idbudget") idbudget: String,
    ): Call<String>

}