package com.oumaymasapplication.app.modules.frame219.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.databinding.RowGridlocationBinding
import com.oumaymasapplication.app.modules.frame219.`data`.model.GridlocationRowModel
import kotlin.Int
import kotlin.collections.List

class GridlocationAdapter(
  var list: List<GridlocationRowModel>
) : RecyclerView.Adapter<GridlocationAdapter.RowGridlocationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlocationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlocation,parent,false)
    return RowGridlocationVH(view)
  }

  override fun onBindViewHolder(holder: RowGridlocationVH, position: Int) {
    val gridlocationRowModel = GridlocationRowModel()
    // TODO uncomment following line after integration with data source
    // val gridlocationRowModel = list[position]
    holder.binding.gridlocationRowModel = gridlocationRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridlocationRowModel>) {
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
      item: GridlocationRowModel
    ) {
    }
  }

  inner class RowGridlocationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlocationBinding = RowGridlocationBinding.bind(itemView)
  }
}
