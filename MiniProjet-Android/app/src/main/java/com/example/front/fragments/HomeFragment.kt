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
import com.example.front.Api.EventsApi
import com.example.front.EventsList.NewsAdapter
import com.example.front.Utils.RetrofitClient
import com.example.front.data.ListEvents
import com.example.front.data.Events
import com.google.gson.Gson


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.json.JSONObject


class HomeFragment : Fragment() {
    lateinit var recylcerNews: RecyclerView
    lateinit var recylcerNewsAdapter: NewsAdapter
     override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        doList()
        return view
    }
private fun doList() {

        val paramObject1 = JSONObject()

        val jsonParser = JsonParser()
        var gsonObject1 = jsonParser.parse(paramObject1.toString()) as JsonObject
        val retro = RetrofitClient().getRetroClinetInstance().create(EventsApi::class.java)

        // get all events  = listEvents()
        retro.listEvents().enqueue(object :Callback<JsonObject>{
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                Toast.makeText(context, "Liste in ", Toast.LENGTH_SHORT).show()
                recylcerNews = view?.findViewById(R.id.recyclerNews) !!
                val jsonString = response.body().toString()
                // Log.d("JsonString", jsonString)

                val gson = Gson()
                val listEvents = gson.fromJson(jsonString, ListEvents::class.java)

                val linearLayoutManager:LinearLayoutManager = LinearLayoutManager(context)
                linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
                recylcerNewsAdapter = NewsAdapter(listEvents)

                recylcerNews.adapter = recylcerNewsAdapter

                recylcerNews.layoutManager = linearLayoutManager

            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                Toast.makeText(context, "Liste out ", Toast.LENGTH_SHORT).show()
            }
        })










    }
}