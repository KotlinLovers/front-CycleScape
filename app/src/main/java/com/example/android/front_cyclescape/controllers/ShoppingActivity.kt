package com.example.android.front_cyclescape.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.front_cyclescape.R

class ShoppingActivity : AppCompatActivity() {

    private lateinit var precioTotalTextView: TextView
    private lateinit var mensajeTextView: TextView
    private lateinit var siguienteProcesoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        precioTotalTextView = findViewById(R.id.precio_total)
        mensajeTextView = findViewById(R.id.mensaje1)
        siguienteProcesoButton = findViewById(R.id.siguiente_proceso)

        siguienteProcesoButton.setOnClickListener {
        }

        actualizarPrecioTotal(0.0)
    }

    private fun actualizarPrecioTotal(total: Double) {
        precioTotalTextView.text = "Total: $$total"
    }

}
