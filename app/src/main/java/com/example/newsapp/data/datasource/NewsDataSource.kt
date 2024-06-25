package com.example.newsapp.data.datasource

import com.example.newsapp.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    fun getNewsHeadline(country: String) : Response<NewsResponse>
}