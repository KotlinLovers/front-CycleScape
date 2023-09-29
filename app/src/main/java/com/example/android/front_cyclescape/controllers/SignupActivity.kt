package com.example.android.front_cyclescape.controllers

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.front_cyclescape.R
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignupActivity : AppCompatActivity() {

    lateinit var editTextName: TextInputEditText
    lateinit var editTextLastname: TextInputEditText
    lateinit var editTextBirthdate: TextInputEditText
    lateinit var editTextPhone: TextInputEditText
    lateinit var editTextEmail: TextInputEditText
    lateinit var editTextPassword: TextInputEditText
    lateinit var buttonReg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        editTextName = findViewById(R.id.name)
        editTextLastname = findViewById(R.id.lastname)
        editTextBirthdate = findViewById(R.id.birthdate)
        editTextPhone = findViewById(R.id.phone)
        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)
        buttonReg = findViewById(R.id.btn_register)

        buttonReg.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Enter email and password", Toast.LENGTH_SHORT).show()
            } else {
                // Crear una instancia de Retrofit
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://cyclescape.azurewebsites.net/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                // Crear una instancia de ApiService
                val apiService = retrofit.create(ApiService::class.java)

                // Crear un objeto RegistrationData con los datos del usuario
                val registrationData = RegistrationData(
                    userFirstName = editTextName.text.toString(),
                    userLastName = editTextLastname.text.toString(),
                    userEmail = email,
                    userPassword = password,
                    userPhone = editTextPhone.text.toString(),
                    userBirthDate = editTextBirthdate.text.toString(),
                    imageData = "imagen.jpg"
                )

                // Realizar la llamada POST
                val call = apiService.registerUser(registrationData)
                call.enqueue(/* callback = */ object : Callback<Any> {
                    override fun onResponse(call: Call<Any>, response: Response<Any>) {
                        if (response.isSuccessful) {
                            // Éxito, maneja la respuesta aquí
                        } else {
                            // Error, maneja el error aquí
                        }
                    }

                    override fun onFailure(call: Call<Any>, t: Throwable) {
                        // Error de red, maneja el error aquí
                    }
                })
            }
        }
    }
}