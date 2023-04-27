package com.example.appmvvm.interactors.abstraction

import com.example.appmvvm.views.base.movies.state.MovieViewState


interface IMovieInteractor {

    suspend fun getMoviesList(): MovieViewState

}