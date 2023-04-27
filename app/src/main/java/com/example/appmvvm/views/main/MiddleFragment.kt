package com.example.appmvvm.views.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import com.example.appmvvm.views.base.BaseFragment
import com.example.appmvvm.views.base.movies.state.MovieViewState

class MiddleFragment : BaseFragment<MovieViewState>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

            }
        }
    }

    override val viewModel: MiddleViewModel by viewModels()
}