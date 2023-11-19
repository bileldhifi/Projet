package com.example.front.OrganizationList

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.front.DetailsActivity
import com.example.front.R
import com.example.front.data.ListEvents
import com.example.front.data.ListOrganization
import com.squareup.picasso.Picasso

class OrgAdapter(var OrganizationList: ListOrganization) : RecyclerView.Adapter<OrganizationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrganizationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.org_single_item, parent, false)

        return OrganizationViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrganizationViewHolder, position: Int) {


        //val image =     OrganizationList.organization[position].image
        val title =     OrganizationList.organization[position].name
        val address = OrganizationList.organization[position].address
        val date = OrganizationList.organization[position].date
        //val organisation = OrganizationList.events[position].organization
       val email = OrganizationList.organization[position].email
        //val qrcode = NewsList.events[position].qrcode
        // holder.UserPic.setImageResource(NewsList[position].userPic)
        holder.NameOrganization.text=title
        holder.LieuOrganization.text = address
        holder.DateOrganization.text = date
       // Picasso.get().load("http:///10.0.2.2:3000/"+image).into(holder.ImageEvent);
        holder.itemView.setOnClickListener{
            val currentItem = OrganizationList.organization[position]
            //Log.i("test",currentItem.toString())
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.apply {
                intent.putExtra("name", currentItem.name)
                intent.putExtra("date", currentItem.date)
               // intent.putExtra("organisation", currentItem.organization)
                intent.putExtra("address ", currentItem.address )
               // intent.putExtra("image", currentItem.image)
                intent.putExtra("description", currentItem.email)

              //  intent.putExtra("qrcode", currentItem.qrcode)

            }
            holder.itemView.context.startActivity(intent)
        }



    }
    override fun getItemCount() = OrganizationList.organization.size

}