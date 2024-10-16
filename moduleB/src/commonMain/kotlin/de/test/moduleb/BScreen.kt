package de.test.moduleb

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BScreen(
    modifier: Modifier = Modifier,
    text: String,
    navBack: () -> Unit,
) {
    Text(text = text, modifier = modifier)
}
