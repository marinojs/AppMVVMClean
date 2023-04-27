package com.example.appmvvm.views.main

import com.example.appmvvm.views.base.BaseViewModel
import com.example.appmvvm.views.base.StateEvent
import com.example.appmvvm.views.base.movies.state.MovieViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow

@HiltViewModel
class MiddleViewModel @Inject constructor(
) : BaseViewModel<MovieViewState>() {

    override val _viewData = MutableStateFlow<MovieViewState>(MovieViewState.Idle)

    override fun setStateEvent(stateEvent: StateEvent) {
    }


}