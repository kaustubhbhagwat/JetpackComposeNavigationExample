package com.kaustubh.bhagwat.daily.jetpackcomposenavigationexample

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Detail",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                navController.navigate(Screen.Home.route){
                    popUpTo(Screen.Home.route){
                        inclusive = true
                    }
                }
            }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())
}