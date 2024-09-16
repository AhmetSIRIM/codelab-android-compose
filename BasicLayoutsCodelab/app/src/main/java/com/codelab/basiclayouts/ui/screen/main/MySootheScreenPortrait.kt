package com.codelab.basiclayouts.ui.screen.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.screen.main.component.SootheBottomNavigationComponent

@Composable
fun MySootheScreenPortrait() {
    Scaffold(
        bottomBar = { SootheBottomNavigationComponent() }
    ) { padding ->
        MySootheScreen(Modifier.padding(padding))
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MySootheScreenPortraitPortraitPreview() {
    MySootheScreenPortrait()
}