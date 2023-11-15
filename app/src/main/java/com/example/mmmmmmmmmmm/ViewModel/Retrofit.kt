package com.example.mmmmmmmmmmm.ViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.mmmmmmmmmmm.Repository.ApiService
import com.example.mmmmmmmmmmm.R
import com.example.mmmmmmmmmmm.Connect.RetrofitInstance
import com.example.mmmmmmmmmmm.Model.Location
import com.example.mmmmmmmmmmm.databinding.ActivityMainBinding
import com.example.mmmmmmmmmmm.databinding.ActivityRetrofitBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.reflect.Modifier

class Retrofit : AppCompatActivity() {
    lateinit var binding:ActivityRetrofitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetrofitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPreference  = getSharedPreferences("mydb", MODE_PRIVATE)
        val editor = sharedPreference.edit()

        val resultTextView = binding.resultTextView



    }
}
