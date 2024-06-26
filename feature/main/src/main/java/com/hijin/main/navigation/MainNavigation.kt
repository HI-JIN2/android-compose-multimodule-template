package com.yourssu.drawer.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.toRoute
import com.yourssu.drawer.compose.anotherteamservice.AnotherTeamServiceRoute
import com.yourssu.drawer.compose.main.MainRoute
import com.yourssu.drawer.compose.mydrawer.MyDrawerRoute
import com.yourssu.drawer.compose.search.SearchRoute
import com.yourssu.drawer.compose.servicedetail.ServiceDetailRoute
import com.yourssu.drawer.compose.servicepage.ServicePageRoute

@Serializable
data object Drawer

fun NavHostController.navigateToDrawer(navOptions: NavOptions) = navigate(Drawer, navOptions)

fun NavHostController.navigateToDrawerServiceDetailScreen(productNo: Long) = navigate(DrawerScreen.ServiceDetailScreen(productNo))

internal sealed interface DrawerScreen {
    @Serializable
    data object MainScreen : DrawerScreen

    @Serializable
    data class AnotherTeamServiceScreen(
        val providerId: String,
    ) : DrawerScreen

    @Serializable
    data class MyDrawerDetailScreen(
        val tabIndex: Int,
    ) : DrawerScreen

    @Serializable
    data class ServiceDetailScreen(
        val productNo: Long,
    ) : DrawerScreen

    @Serializable
    data class ServicePageScreen(
        val title: String,
    ) : DrawerScreen

    @Serializable
    data object SearchScreen : DrawerScreen
}


fun NavGraphBuilder.drawerScreen(
    navController: NavHostController,
) {
    navigation<Drawer>(
        startDestination = DrawerScreen.MainScreen,
    ) {
        composable<DrawerScreen.MainScreen> {
            MainRoute(navController = navController)
        }

        composable<DrawerScreen.AnotherTeamServiceScreen> {
            val args = it.toRoute<DrawerScreen.AnotherTeamServiceScreen>()
            AnotherTeamServiceRoute(
                providerId = args.providerId,
                navController = navController,
            )
        }

        composable<DrawerScreen.MyDrawerDetailScreen> {
            val args = it.toRoute<DrawerScreen.MyDrawerDetailScreen>()
            MyDrawerRoute(
                tabIndex = args.tabIndex,
                navController = navController,
            )
        }

        composable<DrawerScreen.ServiceDetailScreen> {
            val args = it.toRoute<DrawerScreen.ServiceDetailScreen>()
            ServiceDetailRoute(
                productNo = args.productNo,
                navController = navController,
            )
        }

        composable<DrawerScreen.ServicePageScreen> {
            val args = it.toRoute<DrawerScreen.ServicePageScreen>()
            ServicePageRoute(
                title = args.title,
                navController = navController,
            )
        }

        composable<DrawerScreen.SearchScreen> {
            SearchRoute(
                navController = navController,
            )
        }
    }
}
