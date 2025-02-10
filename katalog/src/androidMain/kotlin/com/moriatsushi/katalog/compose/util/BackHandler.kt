package com.moriatsushi.katalog.compose.util

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable

@Composable
internal actual fun BackHandler(enabled: Boolean, onBack: () -> Unit) = BackHandler(enabled, onBack)
