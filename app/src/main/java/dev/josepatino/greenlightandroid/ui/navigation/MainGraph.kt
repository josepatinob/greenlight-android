package dev.josepatino.greenlightandroid.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.josepatino.greenlightandroid.ui.Screens
import dev.josepatino.greenlightandroid.ui.features.MoviesScreen
import dev.josepatino.greenlightandroid.ui.features.PeopleScreen
import dev.josepatino.greenlightandroid.ui.features.TvShowsScreen

@Composable
fun MainGraph(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController = navController,
        route = Graph.MAIN,
        startDestination = Screens.Movies.route,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(Screens.Movies.route) {
            MoviesScreen()
        }
        composable(Screens.TvShows.route) {
            TvShowsScreen()
        }
        composable(Screens.People.route) {
            PeopleScreen()
        }
    }
}
