package com.example.corourecycler

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}

data class Resource< T>(val status: Status, val data: T?, val msg: String?) {
    companion object {
        fun <T> succes(data: T?) = Resource<T>(Status.SUCCESS, data, null)

        fun <T> error(msg: String) = Resource<T>(Status.ERROR, null, msg)

        fun <T> loading() = Resource<T>(Status.LOADING, null, null)
    }

}

class doSomeThings(){

}