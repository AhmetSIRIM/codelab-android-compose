package com.codelab.basiclayouts.ui.screen.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun MySootheScreen(modifier: Modifier = Modifier) {
    Text("TODO(\"MySootheScreen not yet implemented\")")
}

@Preview(showBackground = true)
@Composable
fun MySootheScreenPreview() {
    MySootheTheme {
        MySootheScreen()
    }
}