package dev.josepatino.greenlightandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import dev.josepatino.greenlightandroid.ui.Screens
import dev.josepatino.greenlightandroid.ui.MainScreen
import dev.josepatino.greenlightandroid.ui.auth.LoginScreen
import dev.josepatino.greenlightandroid.ui.features.MoviesScreen
import dev.josepatino.greenlightandroid.ui.features.PeopleScreen
import dev.josepatino.greenlightandroid.ui.auth.SignUpScreen
import dev.josepatino.greenlightandroid.ui.features.TvShowsScreen
import dev.josepatino.greenlightandroid.ui.navigation.RootNavigationGraph
import dev.josepatino.greenlightandroid.ui.theme.GreenlightAndroidTheme

class MainActivity : ComponentActivity() {

    /*
    * Loosely followed below article
    * https://medium.com/@mathroda/nested-navigation-graph-in-jetpack-compose-with-bottom-navigation-d983c2d4119f
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreenlightAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootNavigationGraph(navHostController = rememberNavController())
                }
            }
        }
    }
}