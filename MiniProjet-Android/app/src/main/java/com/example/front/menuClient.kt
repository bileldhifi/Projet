package com.example.front

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.front.fragments.*
import kotlinx.android.synthetic.main.activity_menu_client.*


class menuClient : AppCompatActivity() {
    private val homeFragment= HomeFragment()
    private val organizationFragment= OrganizationFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_client)

        replaceFragment(homeFragment)
buttonNavigation.setOnNavigationItemSelectedListener{
    when (it.itemId)
    {
        R.id.home->replaceFragment(homeFragment)
        R.id.organization->replaceFragment(organizationFragment)
    }
    true
}

    }
    private fun replaceFragment (fragment: Fragment)
    {
        if(fragment!=null)
        {
              val bundle = Bundle()

            fragment.arguments = bundle
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)


            transaction.commit()
        }

    }



}