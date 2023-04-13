package com.example.appmvvm.data.remote.model

import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_CREATED_BY
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_DESCRIPTION
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_FAVORITE_COUNT
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_ID
import com.example.appmvvm.data.remote.model.Constants.SERIALIZED_ITEMS
import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName(SERIALIZED_CREATED_BY)
    val createdBy: String,
    @SerializedName(SERIALIZED_DESCRIPTION)
    val description: String,
    @SerializedName(SERIALIZED_FAVORITE_COUNT)
    val favoriteCount: Int,
    @SerializedName(SERIALIZED_ID)
    val id: String,
    @SerializedName(SERIALIZED_ITEMS)
    val items: List<MovieResponse>
)