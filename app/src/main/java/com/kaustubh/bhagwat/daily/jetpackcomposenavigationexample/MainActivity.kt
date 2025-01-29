package com.kaustubh.bhagwat.daily.jetpackcomposenavigationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kaustubh.bhagwat.daily.jetpackcomposenavigationexample.ui.theme.JetpackComposeNavigationExampleTheme

class MainActivity : ComponentActivity() {

    lateinit var navController : NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeNavigationExampleTheme {
                navController = rememberNavController()
                SetUpNavGraph(navController)
            }
        }
    }
}
