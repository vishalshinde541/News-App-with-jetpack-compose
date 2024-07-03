package com.example.newsapp.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsapp.ui.components.EmptyState
import com.example.newsapp.ui.components.Loader
import com.example.newsapp.ui.components.NewsList
import com.example.newsapp.ui.components.NewsRowComponent
import com.example.newsapp.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState


const val TAG = "HomeScreen"

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel()) {

    val newsResponse by newsViewModel.news.collectAsState()

    val pageState = rememberPagerState(initialPage = 0, initialPageOffsetFraction = 0f) {
        100
    }

    VerticalPager(state = pageState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 80.dp) { page ->

        when(newsResponse){
            is ResourceState.Loading -> {
                Log.d(TAG, "INSIDE_LOADING")
                Loader()
            }
            is ResourceState.Success-> {
                val response = (newsResponse as ResourceState.Success).data
                Log.d(TAG, "INSIDE_SUCCESS response = $response")
                if (response.articles.isNotEmpty()){
                    EmptyState()
                }else{
                    EmptyState()
                }

            }
            is ResourceState.Error -> {
                Log.d(TAG, "INSIDE_ERROR")
            }
        }
    }

}