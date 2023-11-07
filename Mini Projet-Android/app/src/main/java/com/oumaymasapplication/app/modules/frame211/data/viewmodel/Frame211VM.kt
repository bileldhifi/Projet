package com.oumaymasapplication.app.modules.frame211.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame211.`data`.model.Frame211Model
import org.koin.core.KoinComponent

class Frame211VM : ViewModel(), KoinComponent {
  val frame211Model: MutableLiveData<Frame211Model> = MutableLiveData(Frame211Model())

  var navArguments: Bundle? = null
}
