package com.example.frag_argu

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.fragment_total.*


class MainActivity : AppCompatActivity(){


    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragContainer, TotalFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_result -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragContainer, ResultFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragContainer, TotalFragment())
            .commit()
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
