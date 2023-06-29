package dev.josepatino.greenlightandroid.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.josepatino.greenlightandroid.ui.MainScreen

@Composable
fun RootNavigationGraph(navHostController: NavHostController) {
    val isLoggedIn = false
    NavHost(
        navController = navHostController,
        route = Graph.ROOT,
        // startDestination can be controlled by a viewModel
        // if the user is signed in already you do not go to the auth flow
        startDestination = if (isLoggedIn) Graph.MAIN else Graph.AUTH
    ) {
        // I believe this way of creating a navgraph is needed when not using the main navgraph
        authNavGraph(navHostController)
        composable(route = Graph.MAIN) {
            MainScreen()
        }
    }
}