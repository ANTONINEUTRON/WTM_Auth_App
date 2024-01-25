package com.wtm.wtm_auth_app.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.wtm.wtm_auth_app.viewmodels.AuthViewModel

@Composable
fun HomeScreen(authViewModel: AuthViewModel) {
    Column{
        Text("Welcome to home screen")
        Button(onClick = {authViewModel.logout() }) {
            Text(text = "Signout")
        }
    }
}