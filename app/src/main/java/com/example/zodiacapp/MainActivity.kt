package com.example.zodiacapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)



        bottomMenu = findViewById(R.id.bottom_menu)

        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, homeFragment)
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


        val buttonOpenURL: Button = findViewById(R.id.buttonOpenURL)

        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_APP_EMAIL)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        buttonOpenURL.setOnClickListener {
            startActivity(intent)


        }

    }
}