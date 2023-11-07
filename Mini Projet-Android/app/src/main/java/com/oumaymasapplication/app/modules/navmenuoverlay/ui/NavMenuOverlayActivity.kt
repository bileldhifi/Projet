package com.oumaymasapplication.app.modules.navmenuoverlay.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityNavMenuOverlayBinding
import com.oumaymasapplication.app.modules.navmenuoverlay.`data`.viewmodel.NavMenuOverlayVM
import kotlin.String
import kotlin.Unit

class NavMenuOverlayActivity :
    BaseActivity<ActivityNavMenuOverlayBinding>(R.layout.activity_nav_menu_overlay) {
  private val viewModel: NavMenuOverlayVM by viewModels<NavMenuOverlayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.navMenuOverlayVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NAV_MENU_OVERLAY_ACTIVITY"

  }
}
