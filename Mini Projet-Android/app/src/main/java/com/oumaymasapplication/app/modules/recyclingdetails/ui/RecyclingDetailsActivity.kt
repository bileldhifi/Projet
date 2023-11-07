package com.oumaymasapplication.app.modules.recyclingdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.oumaymasapplication.app.databinding.ActivityRecyclingDetailsBinding
import com.oumaymasapplication.app.modules.recyclingdetails.`data`.model.ListtimeRowModel
import com.oumaymasapplication.app.modules.recyclingdetails.`data`.viewmodel.RecyclingDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecyclingDetailsActivity :
    BaseActivity<ActivityRecyclingDetailsBinding>(R.layout.activity_recycling_details) {
  private val viewModel: RecyclingDetailsVM by viewModels<RecyclingDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeAdapter = ListtimeAdapter(viewModel.listtimeList.value?:mutableListOf())
    binding.recyclerListtime.adapter = listtimeAdapter
    listtimeAdapter.setOnItemClickListener(
    object : ListtimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeRowModel) {
        onClickRecyclerListtime(view, position, item)
      }
    }
    )
    viewModel.listtimeList.observe(this) {
      listtimeAdapter.updateData(it)
    }
    binding.recyclingDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCameraOne.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    fun onClickRecyclerListtime(
      view: View,
      position: Int,
      item: ListtimeRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "RECYCLING_DETAILS_ACTIVITY"

    }
  }
