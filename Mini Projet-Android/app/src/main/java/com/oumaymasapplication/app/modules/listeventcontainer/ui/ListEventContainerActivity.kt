package com.oumaymasapplication.app.modules.listeventcontainer.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityListEventContainerBinding
import com.oumaymasapplication.app.extensions.loadFragment
import com.oumaymasapplication.app.modules.additem.ui.AddItemFragment
import com.oumaymasapplication.app.modules.listevent.ui.ListEventFragment
import com.oumaymasapplication.app.modules.listeventcontainer.`data`.viewmodel.ListEventContainerVM
import kotlin.String
import kotlin.Unit

class ListEventContainerActivity :
    BaseActivity<ActivityListEventContainerBinding>(R.layout.activity_list_event_container) {
  private val viewModel: ListEventContainerVM by viewModels<ListEventContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.listEventContainerVM = viewModel
    val destFragment = ListEventFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = ListEventFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearProfile.setOnClickListener {
      val destFragment = AddItemFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = AddItemFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearHome.setOnClickListener {
      val destFragment = ListEventFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ListEventFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "LIST_EVENT_CONTAINER_ACTIVITY"

  }
}
