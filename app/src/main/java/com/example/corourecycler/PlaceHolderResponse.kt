package com.example.corourecycler
import com.google.gson.annotations.SerializedName


data class PlaceHolderResponse(
    @SerializedName("completed")
    var completed: Boolean? = false,
    @SerializedName("id")
    var id: Int? = 0,
    @SerializedName("title")
    var title: String? = "",
    @SerializedName("userId")
    var userId: Int? = 0
)