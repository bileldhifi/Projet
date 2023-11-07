package com.oumaymasapplication.app.modules.frame220.ui

import android.view.View
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame220Binding
import com.oumaymasapplication.app.modules.frame220.`data`.model.ListuserRowModel
import com.oumaymasapplication.app.modules.frame220.`data`.viewmodel.Frame220VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Frame220Activity : BaseActivity<ActivityFrame220Binding>(R.layout.activity_frame_220) {
  private val viewModel: Frame220VM by viewModels<Frame220VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuserRowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    binding.frame220VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: ListuserRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRAME220ACTIVITY"

  }
}
