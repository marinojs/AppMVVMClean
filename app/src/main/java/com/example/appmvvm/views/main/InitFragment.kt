package com.example.appmvvm.views.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.appmvvm.views.NavigationHost
import com.example.appmvvm.views.base.BaseFragment
import com.example.appmvvm.views.base.BaseViewModel
import com.example.appmvvm.views.base.movies.state.MovieViewState
import com.example.appmvvm.views.compose.InitScreen
import com.example.appmvvm.views.compose.ThirdScreen

class InitFragment : BaseFragment<MovieViewState>() {


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

    override val viewModel: InitViewModel by viewModels()
}