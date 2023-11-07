package com.oumaymasapplication.app.modules.listeventcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.listeventcontainer.`data`.model.ListEventContainerModel
import org.koin.core.KoinComponent

class ListEventContainerVM : ViewModel(), KoinComponent {
  val listEventContainerModel: MutableLiveData<ListEventContainerModel> =
      MutableLiveData(ListEventContainerModel())

  var navArguments: Bundle? = null
}
