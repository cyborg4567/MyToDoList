package com.example.mywishlistapp
//sealed keywords works same as a final keyword in java
sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")
    object AddScreen: Screen("add_screen")
}