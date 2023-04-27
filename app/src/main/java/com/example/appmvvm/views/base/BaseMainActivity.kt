package com.example.appmvvm.views.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseMainActivity <T :ViewState>: AppCompatActivity() {

    abstract val sharedViewModel : BaseSharedViewModel<T>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}