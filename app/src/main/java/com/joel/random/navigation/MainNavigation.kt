package com.joel.random.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNavigation(
    navHostController: NavHostController,
    modifier: Modifier
){

    NavHost(navController = navHostController, startDestination = Villains.VILLAINS_GRAPH, ){

        villainsGraph(navHostController)
        searchGraph(navHostController)
        happyGraph(navHostController)
    }

}