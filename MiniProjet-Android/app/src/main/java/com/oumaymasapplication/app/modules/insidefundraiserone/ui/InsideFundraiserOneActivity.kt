package com.oumaymasapplication.app.modules.insidefundraiserone.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityInsideFundraiserOneBinding
import com.oumaymasapplication.app.modules.insidefundraiserone.`data`.viewmodel.InsideFundraiserOneVM
import kotlin.String
import kotlin.Unit

class InsideFundraiserOneActivity :
    BaseActivity<ActivityInsideFundraiserOneBinding>(R.layout.activity_inside_fundraiser_one) {
  private val viewModel: InsideFundraiserOneVM by viewModels<InsideFundraiserOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.insideFundraiserOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "INSIDE_FUNDRAISER_ONE_ACTIVITY"

  }
}
