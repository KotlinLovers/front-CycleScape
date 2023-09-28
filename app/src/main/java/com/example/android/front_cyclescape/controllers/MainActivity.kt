package com.example.android.front_cyclescape.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.front_cyclescape.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity()
{


    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btMap = findViewById<Button>(R.id.btMap)
        val btCart = findViewById<FloatingActionButton>(R.id.btCart)

        btCart.setOnClickListener {
            val intent = Intent(this, ShoppingActivity::class.java)
            startActivity(intent)
        }
        btMap.setOnClickListener {
            val intent = Intent(
                this,
                MapActivity::class.java
            )
            startActivity(intent)
        }
    }
}







