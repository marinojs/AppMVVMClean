package com.example.appmvvm.data.remote.services

import com.example.appmvvm.data.remote.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("/list/1")
    fun getMovieList(
        @Query("api_key") apiKey: String,
        @Query("language") language: String
    ): ApiResponse

}