package com.oumaymasapplication.app.modules.frame222.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame222.`data`.model.Frame222Model
import org.koin.core.KoinComponent

class Frame222VM : ViewModel(), KoinComponent {
  val frame222Model: MutableLiveData<Frame222Model> = MutableLiveData(Frame222Model())

  var navArguments: Bundle? = null
}
