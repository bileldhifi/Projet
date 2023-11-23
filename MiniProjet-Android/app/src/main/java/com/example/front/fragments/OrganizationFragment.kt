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
import com.example.front.OrganizationsList.OrganizationsAdapter  // Use the correct import statement
import com.example.front.Utils.RetrofitClient
import com.example.front.data.ListOrganizations
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class OrganizationFragment : Fragment() {
    private lateinit var recyclerOrganizations: RecyclerView
    private lateinit var recyclerOrganizationsAdapter: OrganizationsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_organization, container, false)


        doList()
        return view
    }

    private fun doList() {
        val paramObject1 = JSONObject()

        val jsonParser = JsonParser()
        var gsonObject1 = jsonParser.parse(paramObject1.toString()) as JsonObject

        val retro = RetrofitClient().getRetroClinetInstance().create(OrganizationsApi::class.java)

        retro.listOrganizations().enqueue(object : Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                recyclerOrganizations = view?.findViewById(R.id.recyclerOrganizations) !!

                Toast.makeText(context, "Org ", Toast.LENGTH_SHORT).show()
                val jsonString = response.body().toString()
                         Log.d("JsonString", jsonString)

                        val gson = Gson()
                val listOrganizations = gson.fromJson(jsonString, ListOrganizations::class.java)

                val linearLayoutManager:LinearLayoutManager = LinearLayoutManager(context)
                linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

                // Set the data directly in the adapter without using updateData
                        recyclerOrganizationsAdapter = OrganizationsAdapter(listOrganizations)
                        recyclerOrganizations.adapter = recyclerOrganizationsAdapter
                recyclerOrganizations.layoutManager = linearLayoutManager
                    }


            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                Toast.makeText(context, "Organization ", Toast.LENGTH_SHORT).show()
            }
        })
    }
}