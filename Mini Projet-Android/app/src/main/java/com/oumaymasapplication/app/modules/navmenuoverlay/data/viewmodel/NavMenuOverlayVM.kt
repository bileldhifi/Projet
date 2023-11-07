package com.oumaymasapplication.app.modules.navmenuoverlay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.navmenuoverlay.`data`.model.NavMenuOverlayModel
import org.koin.core.KoinComponent

class NavMenuOverlayVM : ViewModel(), KoinComponent {
  val navMenuOverlayModel: MutableLiveData<NavMenuOverlayModel> =
      MutableLiveData(NavMenuOverlayModel())

  var navArguments: Bundle? = null
}
