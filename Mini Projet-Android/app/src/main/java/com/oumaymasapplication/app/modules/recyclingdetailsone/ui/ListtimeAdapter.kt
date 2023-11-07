package com.oumaymasapplication.app.modules.recyclingdetailsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.databinding.RowListtime1Binding
import com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.model.Listtime1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtimeAdapter(
  var list: List<Listtime1RowModel>
) : RecyclerView.Adapter<ListtimeAdapter.RowListtime1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtime1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtime1,parent,false)
    return RowListtime1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtime1VH, position: Int) {
    val listtime1RowModel = Listtime1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtime1RowModel = list[position]
    holder.binding.listtime1RowModel = listtime1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listtime1RowModel>) {
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
      item: Listtime1RowModel
    ) {
    }
  }

  inner class RowListtime1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtime1Binding = RowListtime1Binding.bind(itemView)
  }
}
