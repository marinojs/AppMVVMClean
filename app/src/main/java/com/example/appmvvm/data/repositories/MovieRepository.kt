package com.example.appmvvm.data.repositories

import com.example.appmvvm.data.mapper.MovieMapper
import com.example.appmvvm.data.model.Movie
import com.example.appmvvm.data.remote.sources.MovieDataSource
import com.example.appmvvm.data.repositories.abtractions.IMovieRepository
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val movieDataSource: MovieDataSource, private val movieMapper: MovieMapper
) : IMovieRepository {

    override suspend fun getMovieList(): List<Movie> {
        val movieList = movieDataSource.getMovieList()
        return movieMapper.toMovie(movieList.items)
    }


}