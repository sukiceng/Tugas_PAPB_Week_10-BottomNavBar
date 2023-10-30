package com.example.tugaspapbweek9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tugaspapbweek9.FragmentsPackage.HomeFragment
import com.example.tugaspapbweek9.FragmentsPackage.ProfileFragment
import com.example.tugaspapbweek9.FragmentsPackage.TicketFragment
import com.example.tugaspapbweek9.databinding.ActivityMainBinding
import com.example.tugaspapbweek9.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // atur tampilan awal dari fragement
        switchFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home -> switchFragment(HomeFragment())
                R.id.ticket -> switchFragment(TicketFragment())
                R.id.profile -> switchFragment(ProfileFragment())
                else ->{

                }
            }
            true
        }
    }

    private fun switchFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}