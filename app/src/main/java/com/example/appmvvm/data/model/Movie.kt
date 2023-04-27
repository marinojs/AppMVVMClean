package com.example.appmvvm.data.model

data class Movie(
    val title: String,
    val overView: String,
    val releaseDate: String,
    val originalLanguage: String,
    val voteAverage: Float,
    val video: Boolean,
    val backDropPath: String
)
