package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_nav_viw)
        val controller = findNavController(R.id.host_fragment)


        val fragmentSet = setOf<Int>(
            R.id.FRAGMENTI1,
            R.id.FRAGMENTI2,
            R.id.FRAGMENTI3,
            R.id.FRAGMENTI4,

            )

        setupActionBarWithNavController(controller, AppBarConfiguration(fragmentSet))
        bottomNavView.setupWithNavController(controller)

    }

}
