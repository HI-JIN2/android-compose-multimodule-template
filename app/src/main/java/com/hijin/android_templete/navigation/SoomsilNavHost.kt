package com.yourssu.soomsil.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yourssu.drawer.navigation.drawerScreen
import com.yourssu.soomsil.home.navigation.Home
import com.yourssu.soomsil.home.navigation.homeScreen
import com.yourssu.soomsil.saint.navigation.saintScreen
import com.yourssu.soomsil.search.navigation.navigateToSearchResult
import com.yourssu.soomsil.search.navigation.searchScreen

@Composable
fun SoomsilNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: Any = Home,
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination,
    ) {
        homeScreen(
            navigateToSearch = { navController.navigateToTopLevelDestination(TopLevelDestination.SEARCH) },
            navigateToSearchResult = { keyword ->
                navController.navigateToSearchResult(keyword)
            },
            navigateToDrawer = { navController.navigateToTopLevelDestination(TopLevelDestination.DRAWER) },
            navigateToDrawerItem = { id ->
//                navController.navigate(DrawerScreen.Result(id))
            },
        )
        drawerScreen(navController)
        searchScreen(navController) { navController.navigateToTopLevelDestination(TopLevelDestination.HOME) }
        saintScreen(navController)
    }
}
