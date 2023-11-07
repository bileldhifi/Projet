package com.oumaymasapplication.app.modules.reclamation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.oumaymasapplication.app.databinding.SlideritemReclamation1Binding
import com.oumaymasapplication.app.modules.reclamation.`data`.model.ImageSliderSliderrectangle2314Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class Sliderrectangle2314Adapter(
  val dataList: ArrayList<ImageSliderSliderrectangle2314Model>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrectangle2314Model>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemReclamation1Binding) {
      binding.imageSliderSliderrectangle2314Model = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemReclamation1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
