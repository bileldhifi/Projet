package com.oumaymasapplication.app.modules.frame223.ui

import android.view.View
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame223Binding
import com.oumaymasapplication.app.modules.frame223.`data`.model.List050721RowModel
import com.oumaymasapplication.app.modules.frame223.`data`.model.SpinnerNameThreeModel
import com.oumaymasapplication.app.modules.frame223.`data`.viewmodel.Frame223VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Frame223Activity : BaseActivity<ActivityFrame223Binding>(R.layout.activity_frame_223) {
  private val viewModel: Frame223VM by viewModels<Frame223VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerNameThreeList.value = mutableListOf(
    SpinnerNameThreeModel("Item1"),
    SpinnerNameThreeModel("Item2"),
    SpinnerNameThreeModel("Item3"),
    SpinnerNameThreeModel("Item4"),
    SpinnerNameThreeModel("Item5")
    )
    val spinnerNameThreeAdapter =
    SpinnerNameThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerNameThreeList.value?:
    mutableListOf())
    binding.spinnerNameThree.adapter = spinnerNameThreeAdapter
    val list050721Adapter = List050721Adapter(viewModel.list050721List.value?:mutableListOf())
    binding.recyclerList050721.adapter = list050721Adapter
    list050721Adapter.setOnItemClickListener(
    object : List050721Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : List050721RowModel) {
        onClickRecyclerList050721(view, position, item)
      }
    }
    )
    viewModel.list050721List.observe(this) {
      list050721Adapter.updateData(it)
    }
    binding.frame223VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerList050721(
    view: View,
    position: Int,
    item: List050721RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRAME223ACTIVITY"

  }
}
