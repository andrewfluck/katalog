package com.moriatsushi.katalog.compose

import androidx.activity.compose.BackHandler
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsControllerCompat
import com.moriatsushi.katalog.extensions.getActivity

@Composable
internal actual fun AppWindow(
    darkTheme: Boolean,
) {
    val window = LocalContext.current.getActivity()?.window ?: return

    BackHandler {  }

    val view = LocalView.current
    window.statusBarColor = MaterialTheme.colors.background.toArgb()
    val controller = WindowInsetsControllerCompat(window, view)
    controller.isAppearanceLightNavigationBars = !darkTheme
    controller.isAppearanceLightStatusBars = !darkTheme
}
