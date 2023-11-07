package com.oumaymasapplication.app.modules.recyclingdetailsone.ui

import android.view.View
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.oumaymasapplication.app.databinding.ActivityRecyclingDetailsOneBinding
import com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.model.Listtime1RowModel
import com.oumaymasapplication.app.modules.recyclingdetailsone.`data`.viewmodel.RecyclingDetailsOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecyclingDetailsOneActivity :
    BaseActivity<ActivityRecyclingDetailsOneBinding>(R.layout.activity_recycling_details_one) {
  private val viewModel: RecyclingDetailsOneVM by viewModels<RecyclingDetailsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeAdapter = ListtimeAdapter(viewModel.listtimeList.value?:mutableListOf())
    binding.recyclerListtime.adapter = listtimeAdapter
    listtimeAdapter.setOnItemClickListener(
    object : ListtimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listtime1RowModel) {
        onClickRecyclerListtime(view, position, item)
      }
    }
    )
    viewModel.listtimeList.observe(this) {
      listtimeAdapter.updateData(it)
    }
    binding.recyclingDetailsOneVM = viewModel
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
    }

    fun onClickRecyclerListtime(
      view: View,
      position: Int,
      item: Listtime1RowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "RECYCLING_DETAILS_ONE_ACTIVITY"

    }
  }
