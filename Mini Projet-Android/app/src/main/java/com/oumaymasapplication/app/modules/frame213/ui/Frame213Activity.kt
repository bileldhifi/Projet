package com.oumaymasapplication.app.modules.frame213.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.oumaymasapplication.app.R
import com.oumaymasapplication.app.appcomponents.base.BaseActivity
import com.oumaymasapplication.app.appcomponents.facebookauth.FacebookHelper
import com.oumaymasapplication.app.appcomponents.googleauth.GoogleHelper
import com.oumaymasapplication.app.databinding.ActivityFrame213Binding
import com.oumaymasapplication.app.modules.frame213.`data`.viewmodel.Frame213VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Frame213Activity : BaseActivity<ActivityFrame213Binding>(R.layout.activity_frame_213) {
  private val viewModel: Frame213VM by viewModels<Frame213VM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame213VM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogleplus.setOnClickListener {
        googleLogin.login()
      }
      binding.linearRowfacebookf.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
      }

      companion object {
        const val TAG: String = "FRAME213ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, Frame213Activity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
