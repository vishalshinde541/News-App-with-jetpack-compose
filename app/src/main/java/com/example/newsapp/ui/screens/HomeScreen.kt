package com.example.newsapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsapp.ui.components.Loader
import com.example.newsapp.ui.components.NewsList
import com.example.newsapp.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState


const val TAG = "HomeScreen"

@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel()) {

    val newsResponse by newsViewModel.news.collectAsState()

    Surface(modifier = Modifier.fillMaxSize()) {

        when(newsResponse){
            is ResourceState.Loading -> {
                Log.d(TAG, "INSIDE_LOADING")
                Loader()
            }
            is ResourceState.Success-> {
               val response = (newsResponse as ResourceState.Success).data
                Log.d(TAG, "INSIDE_SUCCESS response = $response")
                NewsList(response)
            }
            is ResourceState.Error -> {
                Log.d(TAG, "INSIDE_ERROR")
            }
        }
    }
}