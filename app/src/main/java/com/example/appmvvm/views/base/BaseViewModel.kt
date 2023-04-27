package com.example.appmvvm.views.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel<T : ViewState> : ViewModel() {

    protected abstract val _viewData: MutableStateFlow<T>
    val viewData: StateFlow<T>
        get() = _viewData

    abstract fun setStateEvent(stateEvent: StateEvent)

}