package com.joel.random.data

data class Villain(
    val id : Int,
    val title : String,
    val description : String,
    val image : Int
) {
    fun makeQuery(){

    }
}

data class Countries(
    val id : Int,
    val title: String,
    val description: String,
    val image: String
)

data class AndroidTools(
    val id : Int,
    val title: String,
    val description: String,
    val image: Int
)
