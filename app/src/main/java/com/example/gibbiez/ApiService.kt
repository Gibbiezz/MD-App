package com.example.gibbiez

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("recommendations")
    fun getRecommendations(@Body imageBase64: String): Call<FoodRecommendation>
}

