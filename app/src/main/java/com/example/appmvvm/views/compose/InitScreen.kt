package com.example.appmvvm.views.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun InitScreen(
    goToMiddleScreen: () -> Unit
) {
    Column {
        Text(text = "INIT")
        Button(onClick = { goToMiddleScreen() }) {
            Text(text = "Go to  Middle Screen")
        }
    }
}