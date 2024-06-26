package com.yourssu.soomsil.navigation

//import androidx.annotation.DrawableRes
//import androidx.navigation.NavGraph.Companion.findStartDestination
//import androidx.navigation.NavHostController
//import androidx.navigation.navOptions
//import com.yourssu.drawer.navigation.Drawer
//import com.yourssu.drawer.navigation.navigateToDrawer
//import com.yourssu.soomsil.R
//import com.yourssu.soomsil.home.navigation.Home
//import com.yourssu.soomsil.home.navigation.navigateToHome
//import com.yourssu.soomsil.saint.navigation.Saint
//import com.yourssu.soomsil.saint.navigation.navigateToSaint
//import com.yourssu.soomsil.search.navigation.Search
//import com.yourssu.soomsil.search.navigation.navigateToSearch
//
//val topDestinations: List<TopLevelDestination> = TopLevelDestination.entries
//
//enum class TopLevelDestination(
//    val route: String,
//    @DrawableRes val selectedIcon: Int,
//    @DrawableRes val unselectedIcon: Int,
//) {
//    HOME(
//        route = Home.javaClass.name,
//        selectedIcon = R.drawable.ic_home_filled,
//        unselectedIcon = R.drawable.ic_home_line,
//    ),
//    SEARCH(
//        route = Search.javaClass.name,
//        selectedIcon = R.drawable.ic_search_line,
//        unselectedIcon = R.drawable.ic_search_line,
//    ),
//    DRAWER(
//        route = Drawer.javaClass.name,
//        selectedIcon = R.drawable.ic_drawer_filled,
//        unselectedIcon = R.drawable.ic_drawer_line,
//    ),
//    SAINT(
//        route = Saint.javaClass.name,
//        selectedIcon = R.drawable.ic_rank_filled,
//        unselectedIcon = R.drawable.ic_rank_line,
//    ),
//}
//
//fun NavHostController.navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
//    val topLevelNavOptions = navOptions {
//        // Pop up to the start destination of the graph to
//        // avoid building up a large stack of destinations
//        // on the back stack as users select items
//        popUpTo(this@navigateToTopLevelDestination.graph.findStartDestination().id) {
//            saveState = true
//        }
//        // Avoid multiple copies of the same destination when
//        // reselecting the same item
//        launchSingleTop = true
//        // Restore state when reselecting a previously selected item
//        restoreState = true
//    }
//
//    when (topLevelDestination) {
//        TopLevelDestination.HOME -> this.navigateToHome(topLevelNavOptions)
//        TopLevelDestination.SEARCH -> this.navigateToSearch(topLevelNavOptions)
//        TopLevelDestination.DRAWER -> this.navigateToDrawer(topLevelNavOptions)
//        TopLevelDestination.SAINT -> this.navigateToSaint(topLevelNavOptions)
//    }
//}
