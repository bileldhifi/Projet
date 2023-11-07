package com.oumaymasapplication.app.modules.recyclingdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oumaymasapplication.app.modules.recyclingdetails.`data`.model.ListtimeRowModel
import com.oumaymasapplication.app.modules.recyclingdetails.`data`.model.RecyclingDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecyclingDetailsVM : ViewModel(), KoinComponent {
  val recyclingDetailsModel: MutableLiveData<RecyclingDetailsModel> =
      MutableLiveData(RecyclingDetailsModel())

  var navArguments: Bundle? = null

  val listtimeList: MutableLiveData<MutableList<ListtimeRowModel>> =
      MutableLiveData(mutableListOf())
}
