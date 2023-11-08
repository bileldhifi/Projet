package com.oumaymasapplication.app.modules.rewards.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityRewardsBinding
import com.oumaymasapplication.app.modules.rewards.`data`.viewmodel.RewardsVM
import kotlin.String
import kotlin.Unit

class RewardsActivity : BaseActivity<ActivityRewardsBinding>(R.layout.activity_rewards) {
  private val viewModel: RewardsVM by viewModels<RewardsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rewardsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REWARDS_ACTIVITY"

  }
}
