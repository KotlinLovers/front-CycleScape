package com.example.android.front_cyclescape.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.android.front_cyclescape.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), GoogleMap.OnMapClickListener,
    GoogleMap.OnMapLongClickListener, OnMapReadyCallback {
    lateinit var txtLatitude: EditText
    lateinit var txtLongitude: EditText
    lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        txtLatitude = findViewById(R.id.txtLatitude)
        txtLongitude = findViewById(R.id.txtLongitude)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.setOnMapClickListener(this)
        mMap.setOnMapLongClickListener(this)

        val mexico = LatLng(19.8077463,-99.4077038)
        mMap.addMarker(MarkerOptions().position(mexico).title("Mexico"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mexico))

    }


    override fun onMapClick(latLng: LatLng) {
        txtLatitude.setText(" " + latLng.latitude);
        txtLongitude.setText(" " + latLng.longitude);
    }

    override fun onMapLongClick(latLng: LatLng) {
        txtLatitude.setText(" " + latLng.latitude);
        txtLongitude.setText(" " + latLng.longitude);
    }
}