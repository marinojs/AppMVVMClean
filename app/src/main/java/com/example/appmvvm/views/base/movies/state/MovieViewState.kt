package com.example.appmvvm.views.base.movies.state

import com.example.appmvvm.data.model.Movie
import com.example.appmvvm.views.base.ViewState

sealed class MovieViewState : ViewState {

    data class Movies(val movies: List<Movie>) : MovieViewState()
    object Loading : MovieViewState()
    object Idle : MovieViewState()

}