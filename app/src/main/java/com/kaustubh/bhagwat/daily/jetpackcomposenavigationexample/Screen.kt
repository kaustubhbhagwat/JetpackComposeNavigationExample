package com.kaustubh.bhagwat.daily.jetpackcomposenavigationexample

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen?id={id}") {
        fun passId(id: Int): String {
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
        }
        fun passNameAndId(id: Int, name: String): String{
            return "detail_screen/$id/$name"
        }
        fun passIdOptional(id: Int = 0): String{
            return "detail_screen?id=$id"
        }
    }
}