package com.oumaymasapplication.app.modules.frame225.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.databinding.RowListleftBinding
import com.oumaymasapplication.app.modules.frame225.`data`.model.ListleftRowModel
import kotlin.Int
import kotlin.collections.List

class ListleftAdapter(
  var list: List<ListleftRowModel>
) : RecyclerView.Adapter<ListleftAdapter.RowListleftVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListleftVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listleft,parent,false)
    return RowListleftVH(view)
  }

  override fun onBindViewHolder(holder: RowListleftVH, position: Int) {
    val listleftRowModel = ListleftRowModel()
    // TODO uncomment following line after integration with data source
    // val listleftRowModel = list[position]
    holder.binding.listleftRowModel = listleftRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListleftRowModel>) {
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
      item: ListleftRowModel
    ) {
    }
  }

  inner class RowListleftVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListleftBinding = RowListleftBinding.bind(itemView)
  }
}
