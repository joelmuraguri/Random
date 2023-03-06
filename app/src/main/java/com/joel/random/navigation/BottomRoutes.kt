package com.joel.random.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.joel.random.R


@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val bottomScreens = listOf(
        BottomRoutes.Home,
        BottomRoutes.Search,
        BottomRoutes.Happy,
    )

    BottomNavigation(
        contentColor = Color.White,
        elevation = 5.dp,
        backgroundColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        bottomScreens.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 9.sp
                    )
                },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray.copy(0.5f),
                alwaysShowLabel = true,
                selected = currentDestination?.route?.contains(item.routes) == true,
                onClick = {
                    navController.navigate(item.routes) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@ExperimentalAnimationApi
@Composable
private fun CustomBottomNavItem(
    modifier: Modifier = Modifier,
    screen: BottomRoutes,
    isSelected: Boolean,
) {
    val animatedIconSize by animateDpAsState(
        targetValue = if (isSelected) 30.dp else 25.dp,
        animationSpec = spring(
            stiffness = Spring.StiffnessLow,
            dampingRatio = Spring.DampingRatioMediumBouncy
        )
    )
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier
                .height(if (isSelected) 36.dp else 26.dp)
                .shadow(
                    elevation = if (isSelected) 15.dp else 0.dp,
                    shape = RoundedCornerShape(20.dp)
                )
                .background(
                    color = MaterialTheme.colors.surface,
                    shape = RoundedCornerShape(20.dp)
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Icon(
                painter = painterResource(id = screen.icon), contentDescription = "bottom Bar Icon",

                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxHeight()
                    .padding(horizontal = 11.dp)
                    .alpha(if (isSelected) 1f else .7f)
                    .size(animatedIconSize),
                tint = if (isSelected) MaterialTheme.colors.primary else Color.Gray
            )

            if (isSelected) {
                Text(
                    text = screen.title,
                    modifier = Modifier.padding(start = 8.dp, end = 10.dp),
                    maxLines = 1,
                    color = MaterialTheme.colors.primary
                )
            }
        }
    }
}



sealed class BottomRoutes(
    val routes : String,
    val icon : Int,
    val title : String
) {

    object Home : BottomRoutes(
        routes = "villains_screen",
        icon = R.drawable.ic_baseline_home,
        title = "Home"
    )

    object Search : BottomRoutes(
        routes = "search",
        icon = R.drawable.ic_baseline_search,
        title = "Search"
    )

    object Happy : BottomRoutes(
        routes = "happy",
        icon = R.drawable.ic_baseline_emoji_happy,
        title = "Happy"
    )
}
