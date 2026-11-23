package com.example.mycoffeeapp.screens.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.R
import com.example.mycoffeeapp.ui.theme.CoffeeBrown


@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun MySearchBar() {

    var searchText by remember { mutableStateOf("") }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = searchText,
            onValueChange = { searchText = it },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_search_rounded_24dp),
                    contentDescription = "Search",
                    tint = Color.Gray
                )
            },
            placeholder = { Text("Search Coffee", color = Color.Gray) },
            shape = RoundedCornerShape(
                topStart = 18.dp,
                topEnd = 0.dp,
                bottomStart = 18.dp,
                bottomEnd = 0.dp
            ),
            singleLine = true,
            modifier = Modifier.weight(1f).height(60.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0xFF2A2A2A),
                focusedContainerColor = Color(0xFF422A24),
                cursorColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.width(6.dp))

        IconButton(
            onClick = {},
            modifier = Modifier
                .size(60.dp)
                .background(
                color = CoffeeBrown,
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 18.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 18.dp
                )
            )
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_filter_alt_rounded_24dp),
                contentDescription = "Filter",
                tint = Color.White
            )
        }
    }
}