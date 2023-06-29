package dev.josepatino.greenlightandroid.ui

sealed class Screens(val route: String, val title: String? = null) {
    object Movies : Screens("movies", "Movies")
    object TvShows : Screens("tv_shows", "TV Shows")
    object People : Screens("people", "People")
    object Login : Screens("login", "Login")
    object SignUp : Screens("sign_up", "Sign Up")
}
