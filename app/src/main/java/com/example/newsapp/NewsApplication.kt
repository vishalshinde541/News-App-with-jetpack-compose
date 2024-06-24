package com.example.newsapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "INSIDE_onCreate_of_NewsApplication")
    }

    companion object{
        const val TAG = "NewsApplication"
    }
}