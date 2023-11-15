package com.example.front.EventsList

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.front.DetailsActivity
import com.example.front.R
import com.example.front.data.ListEvents
import com.squareup.picasso.Picasso

class NewsAdapter(var NewsList: ListEvents) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_single_item, parent, false)

        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {


        val image =     NewsList.events[position].image
        val title =     NewsList.events[position].eventName
        val lieu = NewsList.events[position].eventLocation
        val date = NewsList.events[position].eventDate
        val organisation = NewsList.events[position].organization
        val description = NewsList.events[position].eventDescription
        val qrcode = NewsList.events[position].qrcode
        // holder.UserPic.setImageResource(NewsList[position].userPic)
        holder.TitleEvent.text=title
        holder.LieuEvent.text = lieu
        holder.DateEvent.text = date
        Picasso.get().load("http:///10.0.2.2:3000/"+image).into(holder.ImageEvent);
        holder.itemView.setOnClickListener{
            val currentItem = NewsList.events[position]
            //Log.i("test",currentItem.toString())
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.apply {
                intent.putExtra("name", currentItem.eventName)
                intent.putExtra("date", currentItem.eventDate)
                intent.putExtra("organisation", currentItem.organization)
                intent.putExtra("lieu", currentItem.eventLocation)
                intent.putExtra("image", currentItem.image)
                intent.putExtra("description", currentItem.eventDescription)

                intent.putExtra("qrcode", currentItem.qrcode)

            }
            holder.itemView.context.startActivity(intent)
        }

        /* holder.btnDelete.setOnClickListener {
                 //TODO 13 "Delete a champion from the database and refresh the recyclerView"
                 AppDataBase.getDatabase(holder.itemView.context).champDao().delete(championsList[position])
                 championsList.removeAt(position)
                 notifyDataSetChanged()
             }*/

    }
    override fun getItemCount() = NewsList.events.size

}