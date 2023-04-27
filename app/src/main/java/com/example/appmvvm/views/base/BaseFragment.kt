package com.example.appmvvm.views.base

import androidx.fragment.app.Fragment

abstract class BaseFragment<T : ViewState> : Fragment() {

    abstract val viewModel: BaseViewModel<T>

}