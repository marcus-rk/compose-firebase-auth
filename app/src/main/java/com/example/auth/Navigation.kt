package com.example.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth.ui.Failed
import com.example.auth.ui.login.Login
import com.example.auth.ui.Success
import com.example.auth.ui.Welcome

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            Welcome(getStarted = {navController.navigate("register")})
        }
        composable("register") {
            Login(
                onRegistrationSuccess = { navController.navigate("success") },
                onRegistrationFailed = { navController.navigate("failed") },
                onLoginSuccess = { navController.navigate("success") },
                onLoginFailed = { navController.navigate("failed") }
                )
        }
        composable("failed") {
            Failed()
        }
        composable("success") {
            Success()
        }
    }
}