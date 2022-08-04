package com.example.mvvmapiroomjson.remote

import com.example.mvvmapiroomjson.data.GetAllDetails
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("t2/employee/getAllDetails")
    suspend fun getDetails(): Response<GetAllDetails>
}