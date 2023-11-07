package com.oumaymasapplication.app.modules.listevent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.listevent.`data`.model.ListEventModel
import com.oumaymasapplication.app.modules.listevent.`data`.model.ListEventRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ListEventVM : ViewModel(), KoinComponent {
  val listEventModel: MutableLiveData<ListEventModel> = MutableLiveData(ListEventModel())

  var navArguments: Bundle? = null

  val listEventList: MutableLiveData<MutableList<ListEventRowModel>> =
      MutableLiveData(mutableListOf())
}
