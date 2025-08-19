package com.hijin.android_templete

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hijin.feature1.ui.Feature1Screen
import com.hijin.feature2.ui.Feature2Screen
import com.hijin.feature3.ui.Feature3Screen

// 각 화면을 위한 라우트(route)를 정의하는 sealed 클래스입니다.
// 이는 타입 안전성을 보장하고 오타로 인한 문제를 방지합니다.
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
        // 메인 화면을 그래프에 추가합니다.
        composable(Screen.Main.route) {
            MainScreen(navController = navController)
        }

        // 각 피처 모듈의 Composable 함수를 네비게이션 그래프에 추가합니다.
        // 이로써 `app` 모듈은 피처 모듈의 화면으로 이동할 수 있게 됩니다.
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