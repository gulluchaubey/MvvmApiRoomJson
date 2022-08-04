package com.example.mvvmapiroomjson.data

data class Data(
    val age: Int,
    val education: List<Education>,
    val firstname: String,
    val gender: String,
    val job: List<Job>,
    val lastname: String,
    val picture: String
)