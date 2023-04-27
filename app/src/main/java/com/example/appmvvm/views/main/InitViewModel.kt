package com.example.appmvvm.views.main

import androidx.lifecycle.viewModelScope
import com.example.appmvvm.interactors.abstraction.IMovieInteractor
import com.example.appmvvm.views.base.BaseViewModel
import com.example.appmvvm.views.base.StateEvent
import com.example.appmvvm.views.base.movies.state.MovieStateEvent
import com.example.appmvvm.views.base.movies.state.MovieViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow

@HiltViewModel
class InitViewModel @Inject constructor(
    private val movieInteractor: IMovieInteractor
) : BaseViewModel<MovieViewState>() {

    override val _viewData = MutableStateFlow<MovieViewState>(MovieViewState.Idle)

    override fun setStateEvent(stateEvent: StateEvent) {
        when (stateEvent) {
            is MovieStateEvent.MovieRequest -> movieRequest()
            else -> Unit
        }
    }

    private fun movieRequest() {
        _viewData.value = MovieViewState.Loading
        viewModelScope.let {
            _viewData.value = movieInteractor.getMoviesList()
        }
    }

}