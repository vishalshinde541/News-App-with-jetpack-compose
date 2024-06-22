package com.example.utilities

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object CoreUtility {

    fun isInternetConnected(context: Context) : Boolean{
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val networkCapabilities = connectivityManager.activeNetwork ?: return false
        val actNW = connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false
        val result = when {
            actNW.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            actNW.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            actNW.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }
        return result
    }
}