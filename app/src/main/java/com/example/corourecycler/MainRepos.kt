package com.example.corourecycler

import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class MainRepos {
    private val repo = ManagerAPi.createAPI()

    suspend fun getAllUser() = repo.getUser()

}