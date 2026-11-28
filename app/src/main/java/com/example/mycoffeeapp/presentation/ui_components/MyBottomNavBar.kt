package com.example.mycoffeeapp.presentation.ui_components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.R
import com.example.mycoffeeapp.presentation.theme.LightBrown


@Preview(showBackground = true, device = "spec:width=411dp,height=891dp")
@Composable
fun MyBottomNavBar() {

    // Bottom Navigation Bar
    val navItems = listOf(
        NavItem("Home", R.drawable.ic_home_rounded_24dp),
        NavItem("Favorite", R.drawable.ic_favorite_rounded_24dp),
        NavItem("Cart", R.drawable.ic_shopping_bag_rounded_24dp),
        NavItem("Profile", R.drawable.ic_person_apron_rounded_filled_24dp)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                onClick = {},
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text( item.title) },
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    indicatorColor = MaterialTheme.colorScheme.secondaryContainer
                )
            )
        }
    }
}


data class NavItem (
    val title: String,
    val icon: Int
)