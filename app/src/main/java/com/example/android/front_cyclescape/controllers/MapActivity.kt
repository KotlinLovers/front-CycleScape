package com.example.android.front_cyclescape.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.android.front_cyclescape.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(),
    OnMapReadyCallback {

    lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val btHome = findViewById<Button>(R.id.btHome)

        btHome.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
        val mapFragment = supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //mMap.setOnMapClickListener(this)
        //mMap.setOnMapLongClickListener(this)

        val lima = LatLng(-12.118410691014493, -77.02921287902755)
        //mMap.addMarker(MarkerOptions().position(lima).title("Lima"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lima))

    }

    /*
    override fun onMapClick(latLng: LatLng) {
        txtLatitude.setText(" " + latLng.latitude);
        txtLongitude.setText(" " + latLng.longitude);
    }

    override fun onMapLongClick(latLng: LatLng) {
        txtLatitude.setText(" " + latLng.latitude);
        txtLongitude.setText(" " + latLng.longitude);
    }
     */
}