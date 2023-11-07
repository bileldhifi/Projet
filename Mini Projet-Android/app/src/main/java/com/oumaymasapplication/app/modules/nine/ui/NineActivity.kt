package com.oumaymasapplication.app.modules.nine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityNineBinding
import com.oumaymasapplication.app.modules.frame225.ui.Frame225Activity
import com.oumaymasapplication.app.modules.nine.`data`.viewmodel.NineVM
import kotlin.String
import kotlin.Unit

class NineActivity : BaseActivity<ActivityNineBinding>(R.layout.activity_nine) {
  private val viewModel: NineVM by viewModels<NineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrecyclingcentr.setOnClickListener {
      val destIntent = Frame225Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleftOne.setOnClickListener {
      finish()
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
