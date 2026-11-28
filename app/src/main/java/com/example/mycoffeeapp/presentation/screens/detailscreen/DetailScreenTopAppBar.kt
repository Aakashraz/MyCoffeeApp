package com.example.mycoffeeapp.presentation.screens.detailscreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.R


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun DetailScreenTopAppBar() {

    TopAppBar(
        title = { Text(
            text="Details",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        ) },
        actions = {
            Icon(
                painter = painterResource(R.drawable.ic_favorite_rounded_24dp),
                contentDescription = "Add to Favorites",
                modifier = Modifier.padding(end = 12.dp)
            )
        },
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_arrow_back_ios_new_rounded_24dp),
                contentDescription = "Go Back",
                modifier = Modifier.padding(start = 12.dp)
            )
        }
    )

}