package com.example.zodiacapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


private const val LAST_SELECTED_ITEM="item"
class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bottomMenu = findViewById(R.id.bottom_menu)

        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, homeFragment)
                        .commit()
                }
                R.id.zodiacSigns -> {
                    val zodiacFragment = ZodiacFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, zodiacFragment)
                        .commit()
                }

                R.id.info -> {
                    val infoFragment = InfoFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, infoFragment)
                        .commit()
                }

            }

            true
        }


      bottomMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.home
        }

        override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM,bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
        }
}
