package com.example.ecocitoyen_frontend.Models
 class News(
    val id: Int,
    val title: String,
    val description: String,
    val image: String,
    val date: String,
    val id_user: Int
)
 {
     override fun toString(): String {
         return "News(id=$id, title='$title', description='$description', image='$image', date='$date', id_user=$id_user)"
     }
 }
