package com.oumaymasapplication.app.modules.frame222.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame222Binding
import com.oumaymasapplication.app.modules.frame222.`data`.viewmodel.Frame222VM
import kotlin.String
import kotlin.Unit

class Frame222Activity : BaseActivity<ActivityFrame222Binding>(R.layout.activity_frame_222) {
  private val viewModel: Frame222VM by viewModels<Frame222VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame222VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FRAME222ACTIVITY"

  }
}
