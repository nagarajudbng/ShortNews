package com.example.test.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.data.AppConstants
import com.example.test.data.entity.NewsResponse
import com.example.test.ui.repository.NewsRepository
import com.example.utilities.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectIndexed
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private  val newsRepository: NewsRepository
): ViewModel() {
    private val _news: MutableStateFlow<ResourceState<NewsResponse>> = MutableStateFlow(ResourceState.Loading())
    val news: StateFlow<ResourceState<NewsResponse>> = _news
    init{
        Log.d(TAG,"Init block of NewsViewModel")
        getNews(AppConstants.COUNTRY)
    }

    private fun getNews(country:String){
        viewModelScope.launch {
            newsRepository.getNewsHeadline(country)
                .collectLatest { newsResponse ->
                    _news.value = newsResponse
                }
        }
    }
    companion object{
        const val TAG = "NewsVIewModel Entry"
    }

}