package com.example.newsapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor() : ViewModel() {

    init {
        Log.d(TAG, "INSIDE_init_block_of_NewsViewModel")
    }

    companion object {
        private const val TAG = "NewsViewModel"
    }
}