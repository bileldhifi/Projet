package com.oumaymasapplication.app.modules.frame219.ui

import android.view.View
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame219Binding
import com.oumaymasapplication.app.modules.frame219.`data`.model.GridlocationRowModel
import com.oumaymasapplication.app.modules.frame219.`data`.viewmodel.Frame219VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Frame219Activity : BaseActivity<ActivityFrame219Binding>(R.layout.activity_frame_219) {
  private val viewModel: Frame219VM by viewModels<Frame219VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridlocationAdapter =
    GridlocationAdapter(viewModel.gridlocationList.value?:mutableListOf())
    binding.recyclerGridlocation.adapter = gridlocationAdapter
    gridlocationAdapter.setOnItemClickListener(
    object : GridlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridlocationRowModel) {
        onClickRecyclerGridlocation(view, position, item)
      }
    }
    )
    viewModel.gridlocationList.observe(this) {
      gridlocationAdapter.updateData(it)
    }
    binding.frame219VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridlocation(
    view: View,
    position: Int,
    item: GridlocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRAME219ACTIVITY"

  }
}
