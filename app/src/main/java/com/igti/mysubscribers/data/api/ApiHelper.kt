package com.igti.mysubscribers.data.api

class ApiHelper(private val apiService: ApiService) {
    fun getUsers() = apiService.getUsers()
}