package com.joel.random.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.random.data.Countries

@Composable
fun CountryItem(
    countries: Countries
){

    Card(
        elevation = 5.dp,
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .size(220.dp)
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CountryImage(image = countries.image)
            CountryTitle(title = countries.title)

        }
    }

}

@Composable
fun CountryImage(
    image : String,
    modifier: Modifier = Modifier
){
    Box(
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = image,
            modifier = modifier
                .size(150.dp)
                .fillMaxSize(),
            fontSize = 130.sp
        )
    }
}

@Composable
fun CountryTitle(
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