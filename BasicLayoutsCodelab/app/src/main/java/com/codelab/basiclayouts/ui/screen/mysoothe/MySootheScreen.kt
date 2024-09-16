package com.codelab.basiclayouts.ui.screen.mysoothe

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.ui.screen.mysoothe.component.AlignYourBodyRowComponent
import com.codelab.basiclayouts.ui.screen.mysoothe.component.FavoriteCollectionsGridComponent
import com.codelab.basiclayouts.ui.screen.mysoothe.component.MySootheSectionComponent
import com.codelab.basiclayouts.ui.screen.mysoothe.component.SearchBarComponent
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun MySootheScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))

        SearchBarComponent(Modifier.padding(horizontal = 16.dp))

        MySootheSectionComponent(title = R.string.align_your_body) { AlignYourBodyRowComponent() }

        MySootheSectionComponent(title = R.string.favorite_collections) { FavoriteCollectionsGridComponent() }

        Spacer(Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun MySootheScreenPreview() {
    MySootheTheme {
        MySootheScreen()
    }
}