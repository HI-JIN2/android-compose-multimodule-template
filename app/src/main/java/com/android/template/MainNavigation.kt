package com.android.template

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.feature1.ui.Feature1Screen
import com.android.feature2.ui.Feature2Screen
import com.android.feature3.ui.Feature3Screen


sealed class Screen(val route: String) {
    object Main : Screen("main_screen")
    object Feature1 : Screen("feature1_screen")
    object Feature2 : Screen("feature2_screen")
    object Feature3 : Screen("feature3_screen")
}

@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) {
            MainScreen(navController = navController)
        }
        composable(Screen.Feature1.route) {
            Feature1Screen(navController = navController)
        }
        composable(Screen.Feature2.route) {
            Feature2Screen(navController = navController)
        }
        composable(Screen.Feature3.route) {
            Feature3Screen(navController = navController)
        }
    }
}