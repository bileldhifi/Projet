package com.example.front.EventsList

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.front.R

class OrganizationsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


  val NameOrganization: TextView = itemView.findViewById<TextView>(R.id.NameOrganization)
  val AdressOrganization :TextView = itemView.findViewById<TextView>(R.id.AdressOrganization)
    val DateOrganization :TextView = itemView.findViewById<TextView>(R.id.dateOrganization)
  // val ImageEvent : ImageView = itemView.findViewById<ImageView>(R.id.ImageEvent)

}
