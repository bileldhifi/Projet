package com.oumaymasapplication.app.modules.onboarding.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityOnBoardingBinding
import com.oumaymasapplication.app.modules.frame213.ui.Frame213Activity
import com.oumaymasapplication.app.modules.onboarding.`data`.viewmodel.OnBoardingVM
import kotlin.String
import kotlin.Unit

class OnBoardingActivity : BaseActivity<ActivityOnBoardingBinding>(R.layout.activity_on_boarding) {
  private val viewModel: OnBoardingVM by viewModels<OnBoardingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onBoardingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageEllipseFiftyEight.setOnClickListener {
      val destIntent = Frame213Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ON_BOARDING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnBoardingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
