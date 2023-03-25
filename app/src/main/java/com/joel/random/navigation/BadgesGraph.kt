package com.joel.random.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.badgesGraph(
    navController: NavHostController
){

    navigation(
        startDestination = Badges.BADGES,
        route = Badges.BADGES_GRAPH
    ){
        composable(route = Badges.BADGES){
            com.joel.random.views.Badges()
        }
    }



}