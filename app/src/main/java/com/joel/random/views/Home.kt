package com.joel.random.views

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.joel.random.data.VillainDataStore

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(){

    val villains = VillainDataStore.villainList
    val libraries = VillainDataStore.libraryList
    val countries = VillainDataStore.countriesList

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Villains")})
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {

            LazyVerticalGrid(cells = GridCells.Fixed(2)){
                items(countries.size){ index ->
                    CountryItem(countries = countries[index])
                }
            }
        }
    }

}