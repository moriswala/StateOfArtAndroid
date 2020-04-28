package com.rajesh.stateofartandroid.di

import com.rajesh.stateofartandroid.data.model.AnimalApiService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApiComponent {

   fun injectApiService(service: AnimalApiService)
}