package com.joel.random.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.random.data.RandomItems

@Composable
fun RandomItem(
    items: RandomItems,
    modifier: Modifier
){

    Card(
        elevation = 5.dp,
        shape = RoundedCornerShape(15.dp),
        modifier = modifier
            .size(220.dp)
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RandomImage(image = items.image)
            RandomTitle(title = items.title)

        }
    }

}

@Composable
fun RandomImage(
    image : Int,
    modifier: Modifier = Modifier
){
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = image.toString(),
            modifier = modifier
                .size(150.dp)
                .fillMaxSize(),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun RandomTitle(
    title : String,
){

    Box(
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}