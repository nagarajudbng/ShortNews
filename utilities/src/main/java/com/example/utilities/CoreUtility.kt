package com.example.utilities

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object CoreUtility {
    fun isInternetConnected(context: Context):Boolean{
        val connectionManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as
                ConnectivityManager
        val networkCapability = connectionManager.activeNetwork?:return false;
        val actNw = connectionManager.getNetworkCapabilities(networkCapability)
        val result = when {
            actNw!!.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)->true
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)->true
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)->true
            else ->false
        }
        return result;
    }

}