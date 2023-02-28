package com.igti.mysubscribers.data.repository

import com.igti.mysubscribers.data.api.ApiHelper
import com.igti.mysubscribers.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}