package com.example.front.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.front.*
import com.example.front.Api.OrganizationsApi
import com.example.front.EventsList.OrganizationsAdapter
import com.example.front.Utils.RetrofitClient
import com.example.front.data.ListEvents
import com.example.front.data.Organizations
import com.google.gson.Gson


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.json.JSONObject


class OrganizationFragment : Fragment() {
    lateinit var recylcerOrganization: RecyclerView
    lateinit var recylcerOrganizationsAdapter: OrganizationsAdapter
     override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_organization, container, false)

        doList()
        return view
    }
private fun doList() {

        val paramObject1 = JSONObject()

        val jsonParser = JsonParser()
        var gsonObject1 = jsonParser.parse(paramObject1.toString()) as JsonObject
        val retro = RetrofitClient().getRetroClinetInstance().create(OrganizationsApi::class.java)

        // get all events  = listEvents()
        retro.listOrganizations().enqueue(object :Callback<JsonObject>{
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                Toast.makeText(context, "Liste in ", Toast.LENGTH_SHORT).show()
                recylcerOrganization = view?.findViewById(R.id.recyclerOrganization) !!
                val jsonString = response.body().toString()
                // Log.d("JsonString", jsonString)

                val gson = Gson()
                val listEvents = gson.fromJson(jsonString, ListEvents::class.java)

                val linearLayoutManager:LinearLayoutManager = LinearLayoutManager(context)
                linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
               //recylcerOrganizationsAdapter = OrganizationsAdapter(listOrganizations)

                recylcerOrganization.adapter = recylcerOrganizationsAdapter

                recylcerOrganization.layoutManager = linearLayoutManager

            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                Toast.makeText(context, "Liste out ", Toast.LENGTH_SHORT).show()
            }
        })




        //recylcerNews = view?.findViewById(R.id.recyclerNews)!!
        //  val newsist : ListNews = response.body() as ListNews
        // var newsList : MutableList<NewsRespons.News> = ArrayList()
        //  recylcerNews = view?.findViewById(R.id.recyclerNews)!!

        // var newsList : MutableList<NewsRespons> = ArrayList()
        //  newsList.add(NewsRespons(response.body().News))








    }
}