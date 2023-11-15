package com.example.ecocitoyen_frontend.Models

class Response(var id: Int,
               var content:String,
               var id_admin:Int,
               var id_rec:Int) {
    override fun toString(): String {
        return "Response(id=$id, content='$content', id_admin=$id_admin, id_rec=$id_rec)"
    }
}