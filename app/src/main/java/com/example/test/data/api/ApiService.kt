package com.example.test.data.api

import com.example.test.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface ApiService {
    @GET("v2/top-headlines")
    fun getNewsHeadline(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String = "YOUR_API_KEY"
    ): Response<NewsResponse>
}