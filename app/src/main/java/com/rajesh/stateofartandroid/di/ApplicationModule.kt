package com.rajesh.stateofartandroid.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule (private val application: Application){

    @Provides
    fun provideAppAppContext(): Application = application
}