package com.example.newsapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsapp.ui.viewmodel.NewsViewModel

@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel()) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = "Home Screen")
    }
}