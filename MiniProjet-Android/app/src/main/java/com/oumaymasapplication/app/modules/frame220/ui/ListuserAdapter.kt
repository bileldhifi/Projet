package com.oumaymasapplication.app.modules.frame220.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.databinding.RowListuserBinding
import com.oumaymasapplication.app.modules.frame220.`data`.model.ListuserRowModel
import kotlin.Int
import kotlin.collections.List

class ListuserAdapter(
  var list: List<ListuserRowModel>
) : RecyclerView.Adapter<ListuserAdapter.RowListuserVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuserVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuser,parent,false)
    return RowListuserVH(view)
  }

  override fun onBindViewHolder(holder: RowListuserVH, position: Int) {
    val listuserRowModel = ListuserRowModel()
    // TODO uncomment following line after integration with data source
    // val listuserRowModel = list[position]
    holder.binding.listuserRowModel = listuserRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListuserRowModel>) {
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
      item: ListuserRowModel
    ) {
    }
  }

  inner class RowListuserVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuserBinding = RowListuserBinding.bind(itemView)
  }
}
