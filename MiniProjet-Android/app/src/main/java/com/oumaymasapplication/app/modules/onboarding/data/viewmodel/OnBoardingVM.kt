package com.oumaymasapplication.app.modules.onboarding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.onboarding.`data`.model.OnBoardingModel
import org.koin.core.KoinComponent

class OnBoardingVM : ViewModel(), KoinComponent {
  val onBoardingModel: MutableLiveData<OnBoardingModel> = MutableLiveData(OnBoardingModel())

  var navArguments: Bundle? = null
}
