package com.example.android.front_cyclescape.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.front_cyclescape.R

class MainActivity : AppCompatActivity()
{


    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btMap = findViewById<Button>(R.id.btMap)

        btMap.setOnClickListener {
            val intent = Intent(
                this,
                MapActivity::class.java
            )
            startActivity(intent)
        }

    }
}







