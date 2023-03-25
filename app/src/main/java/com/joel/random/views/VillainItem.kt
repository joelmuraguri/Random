package com.joel.random.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.random.data.RandomItems

@Composable
fun RandomItem(
    items: RandomItems,
    modifier: Modifier,
    onItemClick : (RandomItems)-> Unit
) {

    val itemWidth = ((LocalConfiguration.current.screenWidthDp - 30).toDouble() / 2).dp


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 1.dp, vertical = 10.dp)
            .wrapContentHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .width(itemWidth)
                .height(220.dp),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .clickable {
                        onItemClick(items)
                    }
                    .wrapContentSize(),
                shape = RoundedCornerShape(10.dp),
                elevation = 5.dp)
            {

                Image(
                    painter = painterResource(id = items.image),
                    contentDescription = items.title,
                    modifier = modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff000000).copy(alpha = 0.30F), RoundedCornerShape(10.dp))
                    .padding(horizontal = 10.dp, vertical = 10.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Top
                ) {
                    IconButton(
                        modifier = Modifier
                            .background(Color.Transparent, CircleShape)
                            .size(30.dp)
                            .clip(CircleShape),
                        onClick = {

                        }) {
                    }
                    Text(
                        text = items.title,
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    )
                }
            }
        }
    }

//    Card(
//        elevation = 5.dp,
//        shape = RoundedCornerShape(15.dp),
//        modifier = modifier
//            .size(220.dp)
//            .padding(16.dp)
//            .clickable { onItemClick() }
//    ) {
//        Column(
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            RandomImage(image = items.image)
//            RandomTitle(title = items.title)
//
//        }
//    }

    }

@Composable
fun RandomImage(
        image: Int,
        modifier: Modifier = Modifier
) {
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
        title: String,
) {

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
