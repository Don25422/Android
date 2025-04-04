package com.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nyokabi.harakamall.ui.screens.about.AboutScreen
import com.nyokabi.harakamall.ui.screens.Home.HomeScreen
import com.nyokabi.harakamall.ui.screens.items.ItemScreen
import com.nyokabi.harakamall.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_ITEM) {
             ItemScreen(navController)
        }

        composable(ROUT_START) {
             StartScreen(navController)
        }

    }
}