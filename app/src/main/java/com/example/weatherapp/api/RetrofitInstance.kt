package com.example.weatherapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    // val API_KEY='0f3fe5ff181e433b993192348251807'
    private  const val baseUrl = "https://api.weatherapi.com/"
    private fun  getInstance():Retrofit{
        return Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val weatherAPi : WeatherApi= getInstance().create(WeatherApi::class.java)
}