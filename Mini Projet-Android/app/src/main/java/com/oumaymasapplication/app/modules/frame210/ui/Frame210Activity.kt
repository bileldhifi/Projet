package com.oumaymasapplication.app.modules.frame210.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityFrame210Binding
import com.oumaymasapplication.app.modules.frame210.`data`.viewmodel.Frame210VM
import com.oumaymasapplication.app.modules.frame211.ui.Frame211Activity
import kotlin.String
import kotlin.Unit

class Frame210Activity : BaseActivity<ActivityFrame210Binding>(R.layout.activity_frame_210) {
  private val viewModel: Frame210VM by viewModels<Frame210VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame210VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipsefortyfive.setOnClickListener {
      val destIntent = Frame211Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME210ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame210Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
