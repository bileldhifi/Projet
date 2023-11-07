package com.oumaymasapplication.app.modules.frame211.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame211Binding
import com.oumaymasapplication.app.modules.frame211.`data`.viewmodel.Frame211VM
import com.oumaymasapplication.app.modules.onboarding.ui.OnBoardingActivity
import kotlin.String
import kotlin.Unit

class Frame211Activity : BaseActivity<ActivityFrame211Binding>(R.layout.activity_frame_211) {
  private val viewModel: Frame211VM by viewModels<Frame211VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame211VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangle1587.setOnClickListener {
      val destIntent = OnBoardingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME211ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame211Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
