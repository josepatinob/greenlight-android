package dev.josepatino.greenlightandroid.ui.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(onLoginClick: () -> Unit, onSignUpClick: () -> Unit) {
    Column {
        Text(text = "Login screen!")
        Button(onClick = { onLoginClick() }) {
            Text(text = "Login")
        }
        Button(onClick = { onSignUpClick() }) {
            Text(text = "Sign Up")
        }
    }
}