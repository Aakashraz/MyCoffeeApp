package com.example.mycoffeeapp.screens.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.R
import com.example.mycoffeeapp.model.Product
import com.example.mycoffeeapp.ui.theme.LightBrown
import com.example.mycoffeeapp.ui.theme.LightGray


@Composable
fun ProductCard(product: Product, modifier: Modifier = Modifier) {

// Example-- Call A: no modifier passed
// ProductCard(product = p)
//  → inside the function, `modifier` = Modifier   (the default kicks in)
//
// Call B: modifier passed
//ProductCard(product = p, modifier = Modifier.weight(1f))
//  → inside the function, `modifier` = Modifier.weight(1f)   (default ignored)

    // modifier: Modifier = Modifier means "modifier is initialized to the caller's argument if they
    // gave one, otherwise to the empty Modifier." It's a normal default parameter (common to many
    // languages); the body then threads modifier down to the root Card,
    // so a caller's Modifier.weight(1f) reaches the node that needs it

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightGray.copy(alpha = 0.7f)
        )
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth().height(160.dp)
            ) {
                Image(
                    painter = painterResource(product.imageResId),
                    contentDescription = "Product Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(26.dp))
                )

                Box(
                    modifier = Modifier.align(Alignment.TopEnd)
                        .padding(horizontal = 8.dp, vertical = 6.dp)
                        .background(
                            color = Color.White.copy(alpha = 0.7f),
                            shape = RoundedCornerShape(12.dp)
                        )
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_favorite_rounded_24dp),
                        contentDescription = "Add to Favorites",
                        tint = LightBrown,
                        modifier = Modifier.size(28.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = product.name,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = product.description,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.DarkGray,
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$${product.price}",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = LightBrown,
                        fontWeight = FontWeight.Bold
                    )
                )

                Surface (
                    onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    color = LightBrown,
                    contentColor = Color.White
                ) {
                    Icon(
                        painter =  painterResource(R.drawable.ic_add_2_rounded_24dp),
                        contentDescription = "Add Coffee to Cart",
                        modifier = Modifier.padding(6.dp)
                    )
                }
            }
        }
    }
}