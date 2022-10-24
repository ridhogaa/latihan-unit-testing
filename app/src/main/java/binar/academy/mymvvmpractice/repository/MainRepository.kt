package binar.academy.mymvvmpractice.repository

import binar.academy.mymvvmpractice.service.ApiHelper


class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getAllCarData()
}