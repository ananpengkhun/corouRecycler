package com.example.corourecycler

import retrofit2.http.GET

interface PlaceHolder {

    @GET("/todos")
    suspend fun getUser() : List<PlaceHolderResponse>
}