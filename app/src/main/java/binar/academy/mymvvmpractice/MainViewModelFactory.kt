package binar.academy.mymvvmpractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import binar.academy.mymvvmpractice.repository.MainRepository
import binar.academy.mymvvmpractice.service.ApiHelper

class MainViewModelFactory(private val apiHelper: ApiHelper) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}