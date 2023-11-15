package com.example.front


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val leftAnimation = AnimationUtils.loadAnimation(this,R.anim.left_animation)
        val rightAnimation = AnimationUtils.loadAnimation(this,R.anim.right_animation)

       val image1=findViewById<ImageView>(R.id.imageView)
        val image2=findViewById<ImageView>(R.id.imageView)
        val application =findViewById<TextView>(R.id.appname)

        image1.startAnimation(topAnimation)
        image2.startAnimation(leftAnimation)
        application.startAnimation(rightAnimation)


        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this,menuClient::class.java)
            startActivity(intent)
        },3000)
    }
}