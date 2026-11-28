package com.example.mycoffeeapp.presentation.ui_components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable


@Composable
fun AppMessageDialog(
    show: Boolean,
    title: String,
    message: String,
    onDismiss: () -> Unit
) {
    if (show) {
        AlertDialog(
            onDismissRequest = onDismiss,   // AlertDialog calls it only when the user dismisses (scrim tap / back press)
            // So onDismissRequest = onDismiss means: "here's the
            // function to call if/when the user dismisses me." It is not "dismiss now."
            // The = is assignment, not invocation.
            title = { Text(text = title) },     // AlertDialog calls this lambda when it renders the title area
            text = { Text(text = message) },    // AlertDialog calls this lambda when it renders the body area
            confirmButton = {
                TextButton(
                    onClick = onDismiss
                ) {
                    Text(text = "OK")
                }
            }   // AlertDialog calls this lambda when it renders the button area;
                // the inner onClick = onDismiss runs only on tap
        )
    }

}