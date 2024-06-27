package com.devnutz.drunkhub

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devnutz.drunkhub.ui.theme.DrunkhubTheme

@Composable
fun GameModes() {
    val cards = listOf(
        "Game 1" to "This is the description for game 1.",
        "Game 2" to "This is the description for game 2.",
        "Game 3" to "This is the description for game 3."
    )

    CardCarousel(cards = cards)
//    CardCarouselExp(cards = cards)
}

@Composable
fun SelectGameScreen() {
    DrunkhubTheme {
        GameModes()
    }
}

@Preview(showBackground = true)
@Composable
fun SelectGameScreenPreview() {
    DrunkhubTheme {
        SelectGameScreen()
    }
}