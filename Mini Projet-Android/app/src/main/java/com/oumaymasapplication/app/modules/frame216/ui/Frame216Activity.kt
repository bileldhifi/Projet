package com.oumaymasapplication.app.modules.frame216.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame216Binding
import com.oumaymasapplication.app.modules.frame216.`data`.viewmodel.Frame216VM
import kotlin.String
import kotlin.Unit

class Frame216Activity : BaseActivity<ActivityFrame216Binding>(R.layout.activity_frame_216) {
  private val viewModel: Frame216VM by viewModels<Frame216VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame216VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME216ACTIVITY"

  }
}
