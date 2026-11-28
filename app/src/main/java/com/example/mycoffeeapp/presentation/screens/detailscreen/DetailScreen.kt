package com.example.mycoffeeapp.presentation.screens.detailscreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.mycoffeeapp.R
import com.example.mycoffeeapp.domain.model.Product


@Composable
fun DetailScreen() {

    // Displaying Products
    val products = listOf(
        Product(1, "Expresso", "Strong & Rich", 2.99, R.drawable.coffee_2),
        Product(2, "Latte", "Smooth & Creamy", 4.50, R.drawable.coffee_3),
        Product(3, "Cappuccino", "With Chocolate", 4.20, R.drawable.coffee_1),
        Product(4, "Mocha", "With cocoa flavor", 4.70, R.drawable.coffee_4),
        Product(5, "Macchiato", "Bold & Milky", 4.60, R.drawable.coffee_5),
        Product(6, "FLat White", "Velvety smooth", 4.40, R.drawable.coffee_6),
        Product(7, "Iced Mocha", "Refreshing & Rich", 4.70, R.drawable.coffee_4),
    )

    Scaffold(
        topBar = { DetailScreenTopAppBar() },
        bottomBar = { DetailScreenBottomBar() }
    ) { }
}