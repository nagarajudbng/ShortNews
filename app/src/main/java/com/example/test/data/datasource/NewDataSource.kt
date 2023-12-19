package com.example.test.data.datasource

import com.example.test.data.entity.NewsResponse
import retrofit2.Response

interface NewDataSource {

    fun getNewsHeadline(country:String): Response<NewsResponse>
}