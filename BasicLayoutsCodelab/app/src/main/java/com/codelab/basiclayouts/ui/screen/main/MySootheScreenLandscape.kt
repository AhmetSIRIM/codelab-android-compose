package com.codelab.basiclayouts.ui.screen.main

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.screen.main.component.SootheNavigationRailComponent
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Preview(widthDp = 640, heightDp = 360)
@Composable
fun MySootheScreenLandscape() {
    MySootheTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                SootheNavigationRailComponent()

                MySootheScreen()
            }
        }
    }
}