package com.rajesh.stateofartandroid

import com.rajesh.stateofartandroid.data.model.AnimalApi
import com.rajesh.stateofartandroid.data.model.AnimalApiService
import com.rajesh.stateofartandroid.di.ApiModule

class ApiModuleTest(val mockService:AnimalApiService): ApiModule() {

    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}