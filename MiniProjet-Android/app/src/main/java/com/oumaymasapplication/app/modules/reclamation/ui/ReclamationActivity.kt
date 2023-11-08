package com.oumaymasapplication.app.modules.reclamation.ui

import androidx.activity.viewModels
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.databinding.ActivityReclamationBinding
import com.oumaymasapplication.app.modules.reclamation.`data`.model.ImageSliderSliderrectangle2314Model
import com.oumaymasapplication.app.modules.reclamation.`data`.model.SpinnerGroupFourteenModel
import com.oumaymasapplication.app.modules.reclamation.`data`.viewmodel.ReclamationVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ReclamationActivity : BaseActivity<ActivityReclamationBinding>(R.layout.activity_reclamation)
    {
  private val imageSliderSliderrectangle2314Items: ArrayList<ImageSliderSliderrectangle2314Model> =
      arrayListOf()


  private val viewModel: ReclamationVM by viewModels<ReclamationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFourteenList.value = mutableListOf(
    SpinnerGroupFourteenModel("Item1"),
    SpinnerGroupFourteenModel("Item2"),
    SpinnerGroupFourteenModel("Item3"),
    SpinnerGroupFourteenModel("Item4"),
    SpinnerGroupFourteenModel("Item5")
    )
    val spinnerGroupFourteenAdapter =
    SpinnerGroupFourteenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFourteenList.value?:
    mutableListOf())
    binding.spinnerGroupFourteen.adapter = spinnerGroupFourteenAdapter
    val sliderrectangle2314Adapter =
    Sliderrectangle2314Adapter(imageSliderSliderrectangle2314Items,true)
    binding.imageSliderSliderrectangle2314.adapter = sliderrectangle2314Adapter
    binding.imageSliderSliderrectangle2314.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderSliderrectangle2314.indicatorCount)
    binding.reclamationVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrectangle2314.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrectangle2314.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RECLAMATION_ACTIVITY"

  }
}
