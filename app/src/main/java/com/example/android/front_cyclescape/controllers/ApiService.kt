package com.example.android.front_cyclescape.controllers

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("cyclescape/v1/auth/register")
    fun registerUser(@Body registrationData: RegistrationData): Call<Any>
}