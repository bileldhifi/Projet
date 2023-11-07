package com.oumaymasapplication.app.modules.frame223.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.databinding.RowList050721Binding
import com.oumaymasapplication.app.modules.frame223.`data`.model.List050721RowModel
import kotlin.Int
import kotlin.collections.List

class List050721Adapter(
  var list: List<List050721RowModel>
) : RecyclerView.Adapter<List050721Adapter.RowList050721VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowList050721VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list050721,parent,false)
    return RowList050721VH(view)
  }

  override fun onBindViewHolder(holder: RowList050721VH, position: Int) {
    val list050721RowModel = List050721RowModel()
    // TODO uncomment following line after integration with data source
    // val list050721RowModel = list[position]
    holder.binding.list050721RowModel = list050721RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<List050721RowModel>) {
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
      item: List050721RowModel
    ) {
    }
  }

  inner class RowList050721VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowList050721Binding = RowList050721Binding.bind(itemView)
  }
}
