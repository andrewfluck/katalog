package com.moriatsushi.katalog.compose.util

import androidx.compose.runtime.Composable

@Composable
internal expect fun BackHandler(enabled: Boolean = true, onBack: () -> Unit)
