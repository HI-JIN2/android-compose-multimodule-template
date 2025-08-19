package com.hijin.android_templete

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "메인 화면",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.Feature1.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("피처 모듈 1로 이동")
        }
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.Feature2.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("피처 모듈 2로 이동")
        }
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.Feature3.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("피처 모듈 3으로 이동")
        }
    }
}