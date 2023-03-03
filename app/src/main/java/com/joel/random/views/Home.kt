package com.joel.random.views

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import com.joel.random.R

@Composable
fun Home(){

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Random Lists")})
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {

            }) {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_autorenew), contentDescription = "")
            }
        }
    ) {
        VillainList()
    }
}






