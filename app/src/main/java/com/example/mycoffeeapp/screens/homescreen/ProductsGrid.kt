package com.example.mycoffeeapp.screens.homescreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.model.Product


@Composable
fun ProductsGrid(products: List<Product>, topContent: @Composable () -> Unit) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        item { topContent() }

        items(products.chunked(2)) { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                ProductCard(
                    product = rowItems[0],
                    modifier = Modifier.weight(1f)
                )

                if (rowItems.size == 2) {
                    ProductCard(
                        product = rowItems[1],
                        modifier = Modifier.weight(1f)
                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                    // The Spacer draws nothing. It only occupies space — it's a sibling
                    // with weight(1f), so it "eats" half the row width, and the real card can
                    // only take the other half.
                }
                // items structure:
                // LazyColumn
                // └─ row 1: [P1,P2] size 2 → if true  → Card(P1, weight 1f) + Card(P2, weight 1f)   → 50/50
                // └─ row 2: [P3,P4] size 2 → if true  → Card(P3, weight 1f) + Card(P4, weight 1f)   → 50/50
                // └─ row 3: [P5,P6] size 2 → if true  → Card(P5, weight 1f) + Card(P6, weight 1f)   → 50/50
                // └─ row 4: [P7]   size 1 → if false → Card(P7, weight 1f) + Spacer(weight 1f)      → left half, right empty
                // Everything hinges on three facts: chunked makes rows, weight splits width, and the last odd chunk needs a spacer so the lone card doesn't stretch full-width.
            }
        }
    }
}