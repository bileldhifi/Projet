package com.oumaymasapplication.app.modules.frame221.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame221Binding
import com.oumaymasapplication.app.modules.frame221.`data`.viewmodel.Frame221VM
import kotlin.String
import kotlin.Unit

class Frame221Activity : BaseActivity<ActivityFrame221Binding>(R.layout.activity_frame_221) {
  private val viewModel: Frame221VM by viewModels<Frame221VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame221VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME221ACTIVITY"

  }
}
