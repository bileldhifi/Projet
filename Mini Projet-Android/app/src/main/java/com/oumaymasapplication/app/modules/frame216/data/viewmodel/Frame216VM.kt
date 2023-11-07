package com.oumaymasapplication.app.modules.frame216.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame216.`data`.model.Frame216Model
import org.koin.core.KoinComponent

class Frame216VM : ViewModel(), KoinComponent {
  val frame216Model: MutableLiveData<Frame216Model> = MutableLiveData(Frame216Model())

  var navArguments: Bundle? = null
}
