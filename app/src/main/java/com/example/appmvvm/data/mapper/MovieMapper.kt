package com.example.appmvvm.data.mapper

import com.example.appmvvm.data.model.Movie
import com.example.appmvvm.data.remote.model.MovieResponse
import javax.inject.Inject

class MovieMapper @Inject constructor() {

    fun toMovie(movieList: List<MovieResponse>): List<Movie> {
        val movies = mutableListOf<Movie>()

        movieList.forEach {
            val newMovie =
                Movie(
                    title = it.title,
                    overView = it.overview,
                    releaseDate = it.realeaseDate,
                    originalLanguage = it.originalLanguage,
                    voteAverage = it.voteAverage,
                    video = it.video,
                    backDropPath = it.backdropPath
                )
            movies.add(newMovie)
        }
        return movies
    }

}