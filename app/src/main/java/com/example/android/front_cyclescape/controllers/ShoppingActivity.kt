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
    private lateinit var carritoRecyclerView: RecyclerView
    private lateinit var siguienteProcesoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        // Inicializar las vistas
        precioTotalTextView = findViewById(R.id.precio_total)
        mensajeTextView = findViewById(R.id.mensaje1)
        //carritoRecyclerView = findViewById(R.id.carrito_lista)
        siguienteProcesoButton = findViewById(R.id.siguiente_proceso)

        // Configurar el comportamiento del botón
        siguienteProcesoButton.setOnClickListener {
            // Aquí puedes agregar lógica para continuar con el siguiente proceso
        }

        // Actualizar el texto del precio total (deberías hacerlo cuando se agreguen elementos al carrito)
        actualizarPrecioTotal(0.0) // Inicialmente, el precio total es $0
    }

    private fun actualizarPrecioTotal(total: Double) {
        precioTotalTextView.text = "Total: $$total"
    }

    // Agrega más funciones según tus necesidades

}
