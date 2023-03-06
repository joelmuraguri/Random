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
import com.joel.random.data.AndroidTools

@Composable
fun AndroidToolsItem(
    tools: AndroidTools,
    modifier: Modifier = Modifier
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
            AndroidToolsImage(image = tools.image)
            AndroidToolsTitle(title = tools.title)
        }
    }
}

@Composable
fun AndroidToolsImage(
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
            contentScale = ContentScale.Inside
        )
    }
}

@Composable
fun AndroidToolsTitle(
    title : String,
//    modifier: Modifier = Modifier
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