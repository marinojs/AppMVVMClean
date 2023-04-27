package com.example.appmvvm.interactors

import com.example.appmvvm.data.remote.HttpClient
import com.example.appmvvm.data.remote.RequestResult
import com.example.appmvvm.data.repositories.abtractions.IMovieRepository
import com.example.appmvvm.interactors.abstraction.IMovieInteractor
import com.example.appmvvm.views.base.movies.state.MovieViewState
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher

class MovieInteractor @Inject constructor(
    private val httClient: HttpClient,
    private val movieRepository: IMovieRepository,
    private val dispatcher: CoroutineDispatcher
) : IMovieInteractor {

    override suspend fun getMoviesList(): MovieViewState {
        val result = httClient.safeApiCall(dispatcher = dispatcher) {
            movieRepository.getMovieList()
        }
        return when (result) {
            is RequestResult.Success -> MovieViewState.Movies(result.data ?: listOf())
            else -> MovieViewState.Idle
        }
    }

}