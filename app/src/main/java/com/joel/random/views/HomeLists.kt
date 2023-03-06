package com.joel.random.views

import android.util.Log
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.random.R
import com.joel.random.data.DataStore


@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun VillainList(
    modifier: Modifier = Modifier,
    onNavigateSearch : () -> Unit
){

    Log.d("VILLAINS", 3.toString())

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())


    val villains = DataStore.villainList

    Scaffold(
        topBar = {
            Box {

                LargeTopAppBar(
                    title = {
                        androidx.compose.material3.Text(
                            "Jetpack Compose",
                            modifier = Modifier
                                .testTag("heading"),
                            fontWeight = FontWeight.Bold
                        )
                    },
                    navigationIcon = {
                        androidx.compose.material3.IconButton(
                            onClick = {  }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.compose_logo),
                                contentDescription = ""
                            )
                        }
                    },
                    colors = TopAppBarDefaults.largeTopAppBarColors(
                        containerColor = Color.Transparent,
                    ),
                    scrollBehavior = scrollBehavior,
                    actions = {
                             IconButton(onClick = { onNavigateSearch() }) {
                                 Icon(painter = painterResource(id = R.drawable.ic_baseline_search), contentDescription = "")
                             }
                         },
                )
            }

        },
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        floatingActionButton = {
                              FloatingActionButton(
                                  onClick = { /*TODO*/ },
                                  modifier = Modifier
                                      .padding(
                                          bottom = 50.dp
                                      )
                              ) {
                                  Icon(painter = painterResource(id = R.drawable.ic_baseline_autorenew), contentDescription = "")
                              }
        },
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    bottom = 50.dp,
                    top = it.calculateTopPadding()
                )
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                
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