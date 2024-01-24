package com.wtm.wtm_auth_app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wtm.wtm_auth_app.screen.HomeScreen
import com.wtm.wtm_auth_app.screen.LoginScreen
import com.wtm.wtm_auth_app.screen.SignupScreen
import com.wtm.wtm_auth_app.viewmodels.AuthViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val authViewModel: AuthViewModel = viewModel()
    var isUserSignIn by rememberSaveable {authViewModel.isUserAuthenticated}

    NavHost(
        navController = navController,
        startDestination = if(isUserSignIn){"home"}else{"login"}
    ){
        composable("login"){
            LoginScreen(navController)
        }
        composable("signup"){
            SignupScreen(navController)
        }
        composable("home"){
            HomeScreen()
        }
    }
}

