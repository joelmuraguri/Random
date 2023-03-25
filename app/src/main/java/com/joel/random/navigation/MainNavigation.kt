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

    NavHost(navController = navHostController, startDestination = Random.RANDOM_GRAPH, ){

        randomGraph(navHostController)
        searchGraph(navHostController)
        badgesGraph(navHostController)
    }

}