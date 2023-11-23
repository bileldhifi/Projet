package com.example.front.OrganizationsList

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.front.R

class OrganizationsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


  val TitleEvent: TextView = itemView.findViewById<TextView>(R.id.NameOrganization)
  val DateEvent :TextView = itemView.findViewById<TextView>(R.id.DateEvent)
    val LieuEvent :TextView = itemView.findViewById<TextView>(R.id.AdressOrganization)
   val ImageEvent : ImageView = itemView.findViewById<ImageView>(R.id.ImageEvent)

}
