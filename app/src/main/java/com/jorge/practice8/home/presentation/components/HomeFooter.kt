package com.jorge.practice8.home.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeFooter(
    modifier: Modifier = Modifier
) {

    Text(
        text = "©Jorge Sanaguaray all rights reserved",
        textAlign = TextAlign.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .alpha(0.3f)
    )

}

@Preview(showBackground = true)
@Composable
fun HomeFooterPreview() {
    HomeFooter()
}