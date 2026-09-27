package com.jorge.practice8.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jorge.practice8.home.presentation.HomeScreen

@Composable
fun NavigationHost(
    modifier: Modifier,
    navController: NavHostController,
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavigationRoute.Home
    ) {

        composable<NavigationRoute.Home> {
            HomeScreen()
        }

    }

}