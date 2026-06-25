package com.example.quickbus

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // go to previous page
        val backArrow: ImageView = findViewById(R.id.imageView17)
        backArrow.setOnClickListener {
            finish() // closes this screen and returns to OnboardScreen1
        }

        val route: TextView = findViewById(R.id.textView22)

        route.setOnClickListener {
            val intent = Intent(this, Route::class.java)
            startActivity(intent)
        }

        val schedule: TextView = findViewById(R.id.textView23)

        schedule.setOnClickListener {
            val intent = Intent(this, Schedule::class.java)
            startActivity(intent)
        }

        val booking: TextView = findViewById(R.id.textView24)

        booking.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            startActivity(intent)
        }

        val payment: TextView = findViewById(R.id.textView25)

        payment.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.selectedItemId = R.id.home // highlight Home

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> true
                R.id.setting -> {
                    startActivity(Intent(this, Setting::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                R.id.notification -> {
                    startActivity(Intent(this, Notification::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                R.id.profile -> {
                    startActivity(Intent(this, Profile::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                else -> false
            }
        }
    }
}
