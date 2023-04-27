package com.example.appmvvm.views.base.movies.state

import com.example.appmvvm.views.base.StateEvent

sealed class MovieStateEvent : StateEvent {

    object MovieRequest : MovieStateEvent()

}
