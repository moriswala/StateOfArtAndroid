package com.rajesh.stateofartandroid.data.repository

import com.rajesh.stateofartandroid.data.api.ApiHelper
import com.rajesh.stateofartandroid.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers():Single<List<User>>{
            return apiHelper.getUsers()
    }


}