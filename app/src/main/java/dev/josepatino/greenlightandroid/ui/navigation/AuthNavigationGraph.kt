package dev.josepatino.greenlightandroid.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import dev.josepatino.greenlightandroid.ui.Screens
import dev.josepatino.greenlightandroid.ui.auth.LoginScreen
import dev.josepatino.greenlightandroid.ui.auth.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = Screens.Login.route
    ) {
        composable(route = Screens.Login.route) {
            LoginScreen(onLoginClick = {
                navController.popBackStack()
                navController.navigate(Graph.MAIN)
            }, onSignUpClick = {
                navController.navigate(Screens.SignUp.route)
            })
        }
        composable(route = Screens.SignUp.route) {
            SignUpScreen()
        }
    }
}