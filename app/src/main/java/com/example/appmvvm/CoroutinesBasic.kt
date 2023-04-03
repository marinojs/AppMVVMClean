package com.example.appmvvm

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CoroutinesBasic {

    fun main (){
        globalScope()
    }

    private fun globalScope() {
        GlobalScope.launch {
            print("*")
        }
    }

}
