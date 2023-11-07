package com.oumaymasapplication.app.modules.listevent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.databinding.RowListEventBinding
import com.oumaymasapplication.app.modules.listevent.`data`.model.ListEventRowModel
import kotlin.Int
import kotlin.collections.List

class ListEventAdapter(
  var list: List<ListEventRowModel>
) : RecyclerView.Adapter<ListEventAdapter.RowListEventVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListEventVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list_event,parent,false)
    return RowListEventVH(view)
  }

  override fun onBindViewHolder(holder: RowListEventVH, position: Int) {
    val listEventRowModel = ListEventRowModel()
    // TODO uncomment following line after integration with data source
    // val listEventRowModel = list[position]
    holder.binding.listEventRowModel = listEventRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListEventRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListEventRowModel
    ) {
    }
  }

  inner class RowListEventVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListEventBinding = RowListEventBinding.bind(itemView)
  }
}
