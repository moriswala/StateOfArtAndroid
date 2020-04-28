package com.rajesh.stateofartandroid

import android.app.Application
import com.rajesh.stateofartandroid.di.PrefModule
import com.rajesh.stateofartandroid.utils.SharedPreferenceHelper

class PrefModuleTest(val mockPrefS: SharedPreferenceHelper): PrefModule() {

    override fun provideSharedPrefHelper(application: Application): SharedPreferenceHelper {
        return mockPrefS
    }
}