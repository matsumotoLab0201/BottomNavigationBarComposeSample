package com.example.bottomnavigationbarcomposeexample

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object ScreenAo : NavigationItem("a", R.drawable.ic_home, "A")
    object ScreenBo : NavigationItem("b", R.drawable.ic_music, "B")
    object ScreenCo : NavigationItem("c", R.drawable.ic_movie, "C")
}