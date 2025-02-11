package com.moriatsushi.katalog.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.moriatsushi.katalog.DEFAULT_TITLE
import com.moriatsushi.katalog.dsl.GroupDefinition
import com.moriatsushi.katalog.ext.KatalogExt
import com.moriatsushi.katalog.registerKatalog

public fun katalogApplication(
    title: String = DEFAULT_TITLE,
    extensions: List<KatalogExt> = emptyList(),
    groupDefinition: GroupDefinition,
) {
    registerKatalog(title, extensions, groupDefinition)
    application {
        var isStayOnTop by remember { mutableStateOf(true) }

        Window(
            onCloseRequest = ::exitApplication,
            alwaysOnTop = isStayOnTop,
            title = title,
        ) {
            MenuBar {
                Menu("Window") {
                    CheckboxItem("Stay On Top", isStayOnTop) { isStayOnTop = !isStayOnTop }
                }
            }

            App()
        }
    }
}

@Composable
actual fun AppWindow(darkTheme: Boolean) {
    // no-op
}
