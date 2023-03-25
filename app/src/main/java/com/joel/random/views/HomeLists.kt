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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.joel.random.R
import com.joel.random.data.DataStore
import com.joel.random.data.RandomItems


@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun RandomList(
    modifier: Modifier = Modifier,
    navigateToDetails : (RandomItems) -> Unit
){

    Log.d("VILLAINS", 3.toString())

    val items = DataStore.randomItemsList

    Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    bottom = 50.dp
                )
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LazyVerticalGrid(columns = GridCells.Fixed(2)){
                    items(items.size){ index ->
                        RandomItem(
                            items = items[index],
                            modifier = modifier.animateItemPlacement(tween(durationMillis = 300)),
                            onItemClick = {
                                navigateToDetails(items[index])
                            }
                        )
                    }
                }
            }
        }

}
