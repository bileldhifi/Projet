package com.oumaymasapplication.app.modules.onboardingone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityOnBoardingOneBinding
import com.oumaymasapplication.app.modules.frame210.ui.Frame210Activity
import com.oumaymasapplication.app.modules.onboarding.ui.OnBoardingActivity
import com.oumaymasapplication.app.modules.onboardingone.`data`.viewmodel.OnBoardingOneVM
import kotlin.String
import kotlin.Unit

class OnBoardingOneActivity :
    BaseActivity<ActivityOnBoardingOneBinding>(R.layout.activity_on_boarding_one) {
  private val viewModel: OnBoardingOneVM by viewModels<OnBoardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onBoardingOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = OnBoardingActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imagePexelsrdnesto.setOnClickListener {
        val destIntent = Frame210Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ON_BOARDING_ONE_ACTIVITY"

    }
  }
