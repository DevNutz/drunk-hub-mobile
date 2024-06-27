package com.devnutz.drunkhub

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardItem(title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description)
        }
    }
}

@Composable
fun CardCarousel(cards: List<Pair<String, String>>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(cards) { card ->
            CardItem(title = card.first, description = card.second)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardCarouselExp(cards: List<Pair<String, String>>) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
        cards.size
    }

    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) { page ->
        val card = cards[page]
        CardItem(title = card.first, description = card.second)
    }
}

