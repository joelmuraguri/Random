package com.joel.random.data


data class RandomItems(
    val id : Int,
    val title: String,
    val description: String,
    val image: Int
) {
    fun makeQuery(query : String) : Boolean{
        val matchingCombinations = listOf(
            "$id",
            "$id $title",
            "${title.first()} ${description.first()}",
        )

        return matchingCombinations.any {
            it.contains(query, ignoreCase = true)
        }
    }
}
