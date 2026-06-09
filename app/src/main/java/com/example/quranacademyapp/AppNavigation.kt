package com.example.quranacademyapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {


val navController = rememberNavController()

NavHost(
navController = navController,
startDestination = "home"
) {

    // feature graphs هتتضاف هنا
    // homeGraph(navController)
    // authGraph(navController)
    // quranGraph(navController)
}
}