package com.joel.random.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.joel.random.views.Search


fun NavGraphBuilder.searchGraph(
    navController: NavHostController
){

    navigation(
        startDestination = Search.SEARCH,
        route = Search.SEARCH_GRAPH
    ){
        composable(route = Search.SEARCH){
            Search()
        }
    }
}