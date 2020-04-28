package com.rajesh.stateofartandroid.data.api

import com.rajesh.stateofartandroid.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers():Single<List<User>>
}