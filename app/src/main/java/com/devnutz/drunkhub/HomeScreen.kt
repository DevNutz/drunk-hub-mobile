package com.devnutz.drunkhub

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.devnutz.drunkhub.ui.theme.DrunkhubTheme

@Composable
fun HomeScreen( navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
        ) {
        // Placeholder for user photo
        Image(
            Icons.Filled.AccountCircle, // Use a real image in your project
            contentDescription = "User Photo",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = "User Name", // Use real user name
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "user@example.com" // Use real user email
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        // Placeholder for settings icon
        IconButton(onClick = { /* Navigate to settings */ }) {
            Icon(
                Icons.Outlined.Settings, // Use a real settings icon
                contentDescription = "Settings"
            )
        }
    }

        // Button to navigate to game screen
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {
                navController.navigate("select_game")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Go to Game Screen")
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    DrunkhubTheme {
        HomeScreen(navController = rememberNavController())
    }
}