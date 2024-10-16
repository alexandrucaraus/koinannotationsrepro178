package de.test.modulea

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AScreen(
    modifier: Modifier = Modifier,
    text: String,
    navBack: () -> Unit,
) {
    Text(text = text, modifier = modifier)
}
