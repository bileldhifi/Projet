package com.oumaymasapplication.app.modules.frame210.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame210.`data`.model.Frame210Model
import org.koin.core.KoinComponent

class Frame210VM : ViewModel(), KoinComponent {
  val frame210Model: MutableLiveData<Frame210Model> = MutableLiveData(Frame210Model())

  var navArguments: Bundle? = null
}
