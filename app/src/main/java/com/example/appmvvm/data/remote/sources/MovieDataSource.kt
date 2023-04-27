package com.example.appmvvm.data.remote.sources

import com.example.appmvvm.data.remote.model.ApiResponse
import com.example.appmvvm.data.remote.model.Constants.API_KEY
import com.example.appmvvm.data.remote.model.Constants.LANGUAGE
import com.example.appmvvm.data.remote.services.MovieService
import javax.inject.Inject

class MovieDataSource @Inject constructor(
    private val movieService: MovieService
) {

    suspend fun getMovieList(): ApiResponse {
        return movieService.getMovieList(apiKey = API_KEY, language = LANGUAGE)
    }
}