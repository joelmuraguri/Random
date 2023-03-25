package com.joel.random.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.joel.random.views.RandomList

fun NavGraphBuilder.randomGraph(
    navController: NavHostController
){

    navigation(
        startDestination = Random.RANDOM,
        route = Random.RANDOM_GRAPH
    ){
        composable(
            route = Random.RANDOM
        ){
            RandomList(
                navController = navController,
            )
        }
    }


}