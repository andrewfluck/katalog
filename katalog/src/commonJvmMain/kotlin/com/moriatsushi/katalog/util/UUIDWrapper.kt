package com.moriatsushi.katalog.util

import java.util.UUID

internal actual object UUIDWrapper {
    actual fun getString(): String {
        return UUID.randomUUID().toString()
    }
}
