package binar.academy.mymvvmpractice.repository

import binar.academy.mymvvmpractice.model.GetAllCarResponse
import binar.academy.mymvvmpractice.service.ApiHelper
import binar.academy.mymvvmpractice.service.ApiService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before

import org.junit.Test

class MainRepositoryTest {

    private lateinit var service: ApiService
    private lateinit var apiHelper: ApiHelper
    private lateinit var repo: MainRepository

    @Before
    fun setup() {
        service = mockk()
        apiHelper = ApiHelper(service)
        repo = MainRepository(apiHelper)
    }

    @Test
    fun getUsers(): Unit = runBlocking {
        val expected = mockk<GetAllCarResponse>()
        every {
            runBlocking {
                service.getAllCar()
            }
        } returns expected

        val actual = repo.getUsers()
        verify {
            runBlocking {
                service.getAllCar()
            }
        }
        Assert.assertEquals(expected, actual)
    }
}