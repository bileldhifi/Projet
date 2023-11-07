package com.oumaymasapplication.app.modules.frame224.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame224.`data`.model.Frame224Model
import org.koin.core.KoinComponent

class Frame224VM : ViewModel(), KoinComponent {
  val frame224Model: MutableLiveData<Frame224Model> = MutableLiveData(Frame224Model())

  var navArguments: Bundle? = null
}
