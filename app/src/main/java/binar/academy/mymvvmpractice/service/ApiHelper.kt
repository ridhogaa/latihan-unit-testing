package binar.academy.mymvvmpractice.service


class ApiHelper(private val apiService: ApiService) {
    
    suspend fun getAllCarData() = apiService.getAllCar()
}