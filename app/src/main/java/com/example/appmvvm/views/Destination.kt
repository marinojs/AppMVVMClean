package com.example.appmvvm.views

sealed class Destination(
    val route: String
) {

    object InitFragment : Destination("initFragment")
    object MiddleFragment : Destination("middleFragment")
    object ThirdFragment : Destination("thirdFragment")

}
