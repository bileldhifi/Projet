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


<<<<<<< HEAD
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
=======
        val image =     OrganizationsList.organizations[position].organizationName
        val title =     OrganizationsList.organizations[position].organizationDescription
        val lieu = OrganizationsList.organizations[position].organizationAddress
        val date = OrganizationsList.organizations[position].organizationEmail
        val organisation = OrganizationsList.organizations[position].organizationPhone
        val description = OrganizationsList.organizations[position].organizationDate
        //val qrcode = OrganizationsList.organizations[position].qrcode
        // holder.UserPic.setImageResource(NewsList[position].userPic)
        holder.TitleEvent.text=title
        holder.LieuEvent.text = lieu
        holder.DateEvent.text = date
       // Picasso.get().load("http:///10.0.2.2:3000/"+image).into(holder.ImageEvent);
        holder.itemView.setOnClickListener{
            val currentItem = OrganizationsList.organizations[position]
            //Log.i("test",currentItem.toString())
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.apply {
                intent.putExtra("name", currentItem.organizationName)
                intent.putExtra("date", currentItem.organizationDescription)
                intent.putExtra("organisation", currentItem.organizationAddress)
                intent.putExtra("lieu", currentItem.organizationEmail)
                intent.putExtra("image", currentItem.organizationPhone)
                intent.putExtra("description", currentItem.organizationDate)

               // intent.putExtra("qrcode", currentItem.qrcode)

>>>>>>> parent of d9a8cf72 (Scan qr code + autorisation)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = organizationsList.organizations.size
}