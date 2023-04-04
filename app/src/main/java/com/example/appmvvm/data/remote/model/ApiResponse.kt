package com.example.appmvvm.data.remote.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName(Constants.SERIALIZED_NAME)
    val name: String
)