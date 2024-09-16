package com.codelab.basiclayouts.ui.screen.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Text("TODO(\"MainScreen not yet implemented\")")
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MySootheTheme {
        MainScreen()
    }
}