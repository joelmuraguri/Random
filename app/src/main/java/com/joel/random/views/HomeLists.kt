package com.joel.random.views

import android.util.Log
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.random.data.DataStore


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VillainList(
    modifier: Modifier = Modifier
){

    Log.d("VILLAINS", 3.toString())

    val villains = DataStore.villainList


    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Villains",
                modifier = modifier
                .align(CenterHorizontally),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            LazyVerticalGrid(columns = GridCells.Fixed(2)){
                items(villains.size){ index ->
                    VillainItem(
                        villain = villains[index],
                        modifier = modifier.animateItemPlacement(tween(durationMillis = 300)))
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AndroidToolsList(
    modifier: Modifier = Modifier
){

    Log.d("ANDROID", 1.toString())
    val libraries = DataStore.libraryList

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
        ) {

            Text(
                text = "Android Tools",
                modifier = modifier
                    .align(CenterHorizontally),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            LazyVerticalGrid(columns = GridCells.Fixed(2)){
                items(libraries.size){ index ->
                    AndroidToolsItem(
                        tools = libraries[index],
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CountryList(
    modifier: Modifier = Modifier
){

    Log.d("COUNTRY", 2.toString())

    val countries = DataStore.countriesList

    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(8.dp)
        ) {

            Text(
                text = "Countries",
                modifier = modifier
                .align(CenterHorizontally),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            LazyVerticalGrid(columns = GridCells.Fixed(2)){
                items(countries.size){ index ->
                    CountryItem(
                        countries = countries[index],
                        modifier = modifier.animateItemPlacement(tween(durationMillis = 300))
                    )
                }
            }
        }
    }

}