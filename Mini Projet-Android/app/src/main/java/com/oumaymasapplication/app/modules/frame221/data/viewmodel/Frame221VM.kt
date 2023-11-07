package com.oumaymasapplication.app.modules.frame221.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.frame221.`data`.model.Frame221Model
import org.koin.core.KoinComponent

class Frame221VM : ViewModel(), KoinComponent {
  val frame221Model: MutableLiveData<Frame221Model> = MutableLiveData(Frame221Model())

  var navArguments: Bundle? = null
}
