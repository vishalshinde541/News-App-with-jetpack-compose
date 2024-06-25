package com.example.newsapp.data.datasource

import com.example.newsapp.data.api.ApiService
import com.example.newsapp.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImp @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {

    override fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }
}