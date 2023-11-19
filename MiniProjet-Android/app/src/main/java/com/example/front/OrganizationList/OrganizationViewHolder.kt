package com.example.front.OrganizationList

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.front.R

class OrganizationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


 val NameOrganization: TextView = itemView.findViewById<TextView>(R.id.NameOrganization)
  val DateOrganization :TextView = itemView.findViewById<TextView>(R.id.DateOrganization)
    val LieuOrganization :TextView = itemView.findViewById<TextView>(R.id.LieuOrganization)
   //val ImageEvent : ImageView = itemView.findViewById<ImageView>(R.id.ImageEvent)

}
