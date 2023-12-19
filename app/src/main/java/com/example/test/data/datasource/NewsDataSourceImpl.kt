package com.example.test.data.datasource

import com.example.test.data.api.ApiService
import com.example.test.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService:ApiService
): NewsDataSource {

    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }
}