package binar.academy.mymvvmpractice.service

import binar.academy.mymvvmpractice.model.GetAllCarResponse
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {

    // GET digunakan untuk memanggil semua data yang terdapat pada server
    @GET("admin/car")
    suspend fun getAllCar(): GetAllCarResponse
}