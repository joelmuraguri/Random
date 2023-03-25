package com.joel.random.views

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.joel.random.data.ComposeBadges
import com.joel.random.data.DataStore


@Composable
fun Badges() {

    val context = LocalContext.current
    val concepts = DataStore.badges

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(bottom = 52.dp)
    ){
        items(concepts.size){ index ->
            ChipItem(
                concepts = concepts[index],
                context = context
            )
        }
    }

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChipItem(
    concepts: ComposeBadges,
    context: Context
){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        contentAlignment = Alignment.Center
    ) {
        Chip(
            onClick = {
                val playVideoIntent =
                    Intent(Intent.ACTION_VIEW, Uri.parse(concepts.URL))
                context.startActivity(playVideoIntent)

            },
            modifier = Modifier
                .padding()
                .size(120.dp),
            shape = CircleShape
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = concepts.title,
                    modifier = Modifier
                )
            }
        }
    }

}

