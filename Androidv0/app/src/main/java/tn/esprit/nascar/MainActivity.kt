package tn.esprit.nascar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import tn.esprit.nascar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //TODO 11 Bind the toolbar to the activity
        val toolbar = binding.toolbarLayout.toolbar
        setSupportActionBar(toolbar)


        binding.btnNews.setOnClickListener {
            changeFragment(NewsFragment(), "NewsFragment")
        }

        binding.btnEvents.setOnClickListener {
            changeFragment(EventsFragment(), "EventsFragment")
        }

        binding.btnProfile.setOnClickListener {
            changeFragment(ProfileFragment(), "ProfileFragment")
        }
        //TODO 2 Implement the first call of the first fragment
        val initialFragment = AboutFragment() // Replace with the fragment you want to show initially
        val initialTag = "AboutFragment" // Replace with the tag for the initial fragment
        changeFragment(initialFragment, initialTag)
    }

    private fun changeFragment(fragment: Fragment, tag: String) {
        //TODO 3 Check if tag is empty then replace the new fragment in the activity.
        //    If tag is not empty replace the new fragment in the activity and use addToBackStack

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment, tag)

        if (!tag.isEmpty()) {
            transaction.addToBackStack(tag)
        }

        transaction.commit()
    }


    //TODO 12 Override the method onCreateOptionsMenu()
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }


    //TODO 13 Override the method onOptionsItemSelected() and Implement info and logout behavior
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.infoItem -> {
                // Handle the infoItem click here
                // Example: Show a toast message
                Toast.makeText(this, "Info clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logoutItem -> {
                // Handle the logoutItem click here
                // Example: Perform logout action
                // Replace this with your actual logout logic
                finish() // Close the activity for demonstration purposes
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}