package com.joel.random.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.happyGraph(
    navController: NavHostController
){

    navigation(
        startDestination = Happy.HAPPY,
        route = Happy.HAPPY_GRAPH
    ){
        composable(route = Happy.HAPPY){
            com.joel.random.views.Happy()
        }
    }



}