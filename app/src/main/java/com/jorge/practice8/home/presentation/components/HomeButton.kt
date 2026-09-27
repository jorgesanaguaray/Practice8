package com.jorge.practice8.home.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    Box {

        Button(
            onClick = { onClick() },
            modifier = modifier.align(Alignment.Center)
        ) {
            Text(text = "Show Users")
        }

    }

}