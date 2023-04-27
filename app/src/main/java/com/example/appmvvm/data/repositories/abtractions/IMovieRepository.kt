package com.example.appmvvm.data.repositories.abtractions

import com.example.appmvvm.data.model.Movie

interface IMovieRepository {

   suspend fun getMovieList(): List<Movie>

}