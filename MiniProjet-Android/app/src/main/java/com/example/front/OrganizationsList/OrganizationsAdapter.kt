package com.example.front.OrganizationsList

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.front.DetailsActivity
import com.example.front.R
import com.example.front.data.ListOrganizations

class OrganizationsAdapter(private var organizationsList: ListOrganizations) :
    RecyclerView.Adapter<OrganizationsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrganizationsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.organization_single_item, parent, false)

        return OrganizationsViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrganizationsViewHolder, position: Int) {


        val name = organizationsList.organizations[position].organizationName
        val description = organizationsList.organizations[position].organizationDescription
        val address = organizationsList.organizations[position].organizationAddress
        val email = organizationsList.organizations[position].organizationEmail
        val phone = organizationsList.organizations[position].organizationPhone
        val date = organizationsList.organizations[position].organizationDate

        holder.NameOrganization.text = name
        holder.AdressOrganization.text = address
        holder.DateOrganization.text = date

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java).apply {
                putExtra("name", name)
                putExtra("description", description)
                putExtra("address", address)
                putExtra("email", email)
                putExtra("phone", phone)
                putExtra("date", date)
                // Add other extras if needed
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = organizationsList.organizations.size
}