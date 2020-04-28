package com.rajesh.stateofartandroid.utils

import android.content.Context
import android.preference.PreferenceManager
import com.rajesh.stateofartandroid.R

class SharedPreferenceHelper(context: Context) {
    private val PREF_API_KEY = "api_key"

    private val pref = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)

    fun getStoredApiKey() = pref.getString(PREF_API_KEY, null)

    fun saveAPIKey(key: String) {
        pref.edit().putString(PREF_API_KEY, key).apply()
    }
}