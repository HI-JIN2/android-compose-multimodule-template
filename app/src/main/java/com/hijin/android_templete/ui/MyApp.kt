package com.yourssu.soomsil.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.yourssu.design.system.compose.component.BottomBarItem
import com.yourssu.soomsil.navigation.SoomsilNavHost
import com.yourssu.soomsil.navigation.TopLevelDestination
import com.yourssu.soomsil.navigation.navigateToTopLevelDestination
import com.yourssu.soomsil.navigation.topDestinations

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
//    Scaffold(
//        bottomBar = {
//            BottomBar(
//                destinations = topDestinations,
//                onNavigateToDestination = navController::navigateToTopLevelDestination,
//                currentDestination = navController.currentBackStackEntryAsState().value?.destination,
//            )
//        },
//    ) { padding ->
//        Column(
//            modifier = Modifier
//                .padding(padding)
//                .fillMaxWidth(),
//        ) {
//            SoomsilNavHost(
//                navController = navController,
//                modifier = modifier,
//            )
//        }
//    }
}

//@Composable
//private fun BottomBar(
//    destinations: List<TopLevelDestination>,
//    onNavigateToDestination: (TopLevelDestination) -> Unit,
//    currentDestination: NavDestination?,
//    modifier: Modifier = Modifier,
//) {
//    BottomBar(modifier) {
//        destinations.forEach { destination ->
//            BottomBarItem(
//                selected = currentDestination.isTopLevelDestinationInHierarchy(destination),
//                onClick = { onNavigateToDestination(destination) },
//                selectedIcon = destination.selectedIcon,
//                unselectedIcon = destination.unselectedIcon,
//            )
//        }
//    }
//}
//
//private fun NavDestination?.isTopLevelDestinationInHierarchy(destination: TopLevelDestination) =
//    this?.hierarchy?.any {
//        it.route?.equals(destination.route) ?: false
//    } ?: false
