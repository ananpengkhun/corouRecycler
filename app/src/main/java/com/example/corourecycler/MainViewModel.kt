package com.example.corourecycler

import androidx.arch.core.util.Function
import androidx.lifecycle.*
import kotlinx.coroutines.*
import java.lang.Exception

class MainViewModel : ViewModel() {

    val repos = MainRepos()
    var _todos = MutableLiveData(false)

    val firstTodo = Transformations.switchMap(_todos){
        liveData(Dispatchers.IO + viewModelScope.coroutineContext) {
            emit(Resource.loading())
            try {
                emit(Resource.succes(repos.getAllUser()))
            }catch (e : Exception){
                emit(Resource.error(e.message!!))
            }

        }
    }

    fun retry(){
        _todos.value = true
    }

    fun featureTwo(){

    }


}