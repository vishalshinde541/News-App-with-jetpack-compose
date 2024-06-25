package com.example.newsapp.data.api

import com.example.newsapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "f61e7a73d16d4012be7a3facb73108a0"
    ): Response<NewsResponse>
}

//GET https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY