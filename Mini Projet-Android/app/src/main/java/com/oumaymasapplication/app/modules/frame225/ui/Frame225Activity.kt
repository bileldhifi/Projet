package com.oumaymasapplication.app.modules.frame225.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame225Binding
import com.oumaymasapplication.app.modules.frame225.`data`.model.ListleftRowModel
import com.oumaymasapplication.app.modules.frame225.`data`.viewmodel.Frame225VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Frame225Activity : BaseActivity<ActivityFrame225Binding>(R.layout.activity_frame_225) {
  private val viewModel: Frame225VM by viewModels<Frame225VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listleftAdapter = ListleftAdapter(viewModel.listleftList.value?:mutableListOf())
    binding.recyclerListleft.adapter = listleftAdapter
    listleftAdapter.setOnItemClickListener(
    object : ListleftAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListleftRowModel) {
        onClickRecyclerListleft(view, position, item)
      }
    }
    )
    viewModel.listleftList.observe(this) {
      listleftAdapter.updateData(it)
    }
    binding.frame225VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListleft(
    view: View,
    position: Int,
    item: ListleftRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRAME225ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame225Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
