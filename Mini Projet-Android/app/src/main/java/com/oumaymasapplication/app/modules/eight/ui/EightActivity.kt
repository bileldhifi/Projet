package com.oumaymasapplication.app.modules.eight.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityEightBinding
import com.oumaymasapplication.app.modules.eight.`data`.viewmodel.EightVM
import com.oumaymasapplication.app.modules.nine.ui.NineActivity
import kotlin.String
import kotlin.Unit

class EightActivity : BaseActivity<ActivityEightBinding>(R.layout.activity_eight) {
  private val viewModel: EightVM by viewModels<EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMap.setOnClickListener {
      val destIntent = NineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.btnArrowleftOne.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EIGHT_ACTIVITY"

  }
}
