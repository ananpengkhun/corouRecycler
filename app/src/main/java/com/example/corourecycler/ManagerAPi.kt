package com.example.corourecycler

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ManagerAPi {

    fun createAPI(): PlaceHolder  {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/todos/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PlaceHolder::class.java)
    }
}