package com.example.front.fragments

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Organization
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
import com.example.front.Api.OrganizationApi
import com.example.front.EventsList.NewsAdapter
import com.example.front.OrganizationList.OrgAdapter
import com.example.front.Utils.RetrofitClient
import com.example.front.data.ListEvents
import com.example.front.data.Events
import com.example.front.data.ListOrganization
import com.google.gson.Gson


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.json.JSONObject


class OrganizationFragment : Fragment() {
    lateinit var recylcerOrganization : RecyclerView
    lateinit var recylcerOrgAdapter: OrgAdapter
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
        val retro = RetrofitClient().getRetroClinetInstance().create(OrganizationApi::class.java)

        // get all events  = listEvents()
        retro.listOrganization().enqueue(object :Callback<JsonObject>{
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                Toast.makeText(context, "Liste in ", Toast.LENGTH_SHORT).show()
                        recylcerOrganization = view?.findViewById(R.id.recyclerorganisation) !!
                val jsonString = response.body().toString()
                // Log.d("JsonString", jsonString)

                val gson = Gson()
                val listOrganization = gson.fromJson(jsonString, ListOrganization::class.java)

                val linearLayoutManager:LinearLayoutManager = LinearLayoutManager(context)
                linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
                recylcerOrgAdapter = OrgAdapter(listOrganization)

                recylcerOrganization.adapter = recylcerOrgAdapter

                recylcerOrganization.layoutManager = linearLayoutManager

            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                Toast.makeText(context, "Liste out ", Toast.LENGTH_SHORT).show()
            }
        })



    }
}