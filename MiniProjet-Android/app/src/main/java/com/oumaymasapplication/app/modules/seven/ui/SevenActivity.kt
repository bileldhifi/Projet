package com.oumaymasapplication.app.modules.seven.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivitySevenBinding
import com.oumaymasapplication.app.modules.seven.`data`.viewmodel.SevenVM
import kotlin.String
import kotlin.Unit

class SevenActivity : BaseActivity<ActivitySevenBinding>(R.layout.activity_seven) {
  private val viewModel: SevenVM by viewModels<SevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SEVEN_ACTIVITY"

  }
}
