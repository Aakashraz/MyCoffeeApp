package com.example.mycoffeeapp.screens.homescreen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Categories() {

    val categories = listOf("All Coffee", "Macchiato", "Latte", "Americano", "Snacks", "Desert")

    var selectedCategory by remember {mutableStateOf(categories.first()) }
    LazyRow(
        modifier = Modifier.padding(horizontal = 12.dp)
    ) {
        items(categories) { category ->
            CategoryChip(
                text = category,
                isSelected = category == selectedCategory,
                onSelected = { selectedCategory = category}
            )
        }
    }
}