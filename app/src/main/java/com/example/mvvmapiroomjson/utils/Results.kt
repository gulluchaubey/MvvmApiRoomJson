package com.example.mvvmapiroomjson.utils

class Results<out T>(val status: STATUS,val data:T?,message:String?)  {
    companion object{
        fun <T> success(status:STATUS,data:T,message: String):Results<T>{
            return Results(STATUS.SUCCESS,data,null)
        }
        fun <T> loading(status: STATUS,data:T,message: String):Results<T>{
            return Results(STATUS.LOADING,null,null)
        }
        fun <T> error(status: STATUS,data:T?,message: String):Results<T>{
            return Results(STATUS.ERROR,null,null)
        }
    }
}

enum class STATUS{
    SUCCESS,
    LOADING,
    ERROR
}