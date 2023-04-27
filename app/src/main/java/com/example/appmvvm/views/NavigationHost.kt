package com.example.appmvvm.views

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appmvvm.views.compose.InitScreen
import com.example.appmvvm.views.compose.MiddleScreen
import com.example.appmvvm.views.compose.ThirdScreen

@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destination.InitFragment.route) {
        composable(route = Destination.InitFragment.route) {
            InitScreen {
                navController.navigate(route = Destination.MiddleFragment.route)
            }
        }
        composable(route = Destination.MiddleFragment.route) {
            MiddleScreen()
        }
        composable(route = Destination.ThirdFragment.route) {
            ThirdScreen()
        }
    }
}