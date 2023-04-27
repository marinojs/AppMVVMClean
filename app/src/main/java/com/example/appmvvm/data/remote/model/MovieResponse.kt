package com.example.appmvvm.data.remote.model

import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_ADULT
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_BACKDROP_PATH
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_GENRES_ID
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_ID
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_MEDIA_TYPE
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_ORIGINAL_LANGUAGE
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_ORIGINAL_TITLE
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_OVERVIEW
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_POPULARITY
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_POSTER_PATH
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_RELEASE_DATE
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_TITLE
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_VIDEO
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_VOTE_AVERAGE
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_VOTE_COUNT
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName(SERIALIZED_ADULT)
    val adult: Boolean,
    @SerializedName(SERIALIZED_BACKDROP_PATH)
    val backdropPath: String,
    @SerializedName(SERIALIZED_GENRES_ID)
    val genreIds: List<Int>,
    @SerializedName(SERIALIZED_ID)
    val id: String,
    @SerializedName(SERIALIZED_MEDIA_TYPE)
    val mediaType: String,
    @SerializedName(SERIALIZED_ORIGINAL_LANGUAGE)
    val originalLanguage: String,
    @SerializedName(SERIALIZED_ORIGINAL_TITLE)
    val originalType: String,
    @SerializedName(SERIALIZED_OVERVIEW)
    val overview: String,
    @SerializedName(SERIALIZED_POPULARITY)
    val popularity: Int,
    @SerializedName(SERIALIZED_POSTER_PATH)
    val posterPath: String,
    @SerializedName(SERIALIZED_RELEASE_DATE)
    val realeaseDate: String,
    @SerializedName(SERIALIZED_TITLE)
    val title: String,
    @SerializedName(SERIALIZED_VIDEO)
    val video: Boolean,
    @SerializedName(SERIALIZED_VOTE_AVERAGE)
    val voteAverage: Float,
    @SerializedName(SERIALIZED_VOTE_COUNT)
    val voteCount: Int
)
