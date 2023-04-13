package com.example.appmvvm.views.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.NavController
import com.example.appmvvm.views.NavigationHost
import com.example.appmvvm.views.base.BaseFragment
import com.example.appmvvm.views.compose.InitScreen
import com.example.appmvvm.views.compose.ThirdScreen

class InitFragment : BaseFragment() {

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

}