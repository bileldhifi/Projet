package com.oumaymasapplication.app.modules.onboardingone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.onboardingone.`data`.model.OnBoardingOneModel
import org.koin.core.KoinComponent

class OnBoardingOneVM : ViewModel(), KoinComponent {
  val onBoardingOneModel: MutableLiveData<OnBoardingOneModel> =
      MutableLiveData(OnBoardingOneModel())

  var navArguments: Bundle? = null
}
