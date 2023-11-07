package com.oumaymasapplication.app.modules.frame213.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.oumaymasapplication.app.modules.frame213.`data`.model.Frame213Model
import org.json.JSONObject
import org.koin.core.KoinComponent

class Frame213VM : ViewModel(), KoinComponent {
  val frame213Model: MutableLiveData<Frame213Model> = MutableLiveData(Frame213Model())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
