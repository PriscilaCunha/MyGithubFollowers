package com.igti.mysubscribers.data.api

import com.igti.mysubscribers.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}