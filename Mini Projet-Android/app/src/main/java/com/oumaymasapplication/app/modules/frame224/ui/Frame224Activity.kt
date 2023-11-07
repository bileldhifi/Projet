package com.oumaymasapplication.app.modules.frame224.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame224Binding
import com.oumaymasapplication.app.modules.frame224.`data`.viewmodel.Frame224VM
import kotlin.String
import kotlin.Unit

class Frame224Activity : BaseActivity<ActivityFrame224Binding>(R.layout.activity_frame_224) {
  private val viewModel: Frame224VM by viewModels<Frame224VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame224VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FRAME224ACTIVITY"

  }
}
