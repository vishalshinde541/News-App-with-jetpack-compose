package com.example.newsapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsapp.ui.viewmodel.NewsViewModel

@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel()) {

    val newsResponse = newsViewModel.news.collectAsState()

    Surface(modifier = Modifier.fillMaxSize()) {

//        when(newsResponse){
//            is ResourceState.Loading -> {
//
//            }
//        }
        Text(text = "Home Screen")
    }
}