package com.example.test.data.api

import com.example.test.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface ApiService {
    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String = "0d5cd1f3cc4c40f699c267a082eba485"
    ): Response<NewsResponse>
}