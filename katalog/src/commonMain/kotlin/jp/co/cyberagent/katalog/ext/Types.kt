package jp.co.cyberagent.katalog.ext

import com.moriatsushi.katalog.ext.ExtComponentWrapper
import com.moriatsushi.katalog.ext.ExtRootWrapper

@Deprecated(
    "The package name has changed.",
    ReplaceWith(
        "ExtComponentWrapper",
        "com.moriatsushi.jp.co.cyberagent.katalog.ExtComponentWrapper",
    ),
)
@ExperimentalKatalogExtApi
public typealias ExtComponentWrapper = ExtComponentWrapper

@Deprecated(
    "The package name has changed.",
    ReplaceWith(
        "ExtRootWrapper",
        "com.moriatsushi.jp.co.cyberagent.katalog.ExtRootWrapper",
    ),
)
@ExperimentalKatalogExtApi
public typealias ExtRootWrapper = ExtRootWrapper

@Deprecated(
    "The package name has changed.",
    ReplaceWith(
        "ExperimentalKatalogExtApi",
        "com.moriatsushi.jp.co.cyberagent.katalog.ExperimentalKatalogExtApi",
    ),
)
// https://youtrack.jetbrains.com/issue/KT-56715
@Suppress("OPT_IN_MARKER_CAN_ONLY_BE_USED_AS_ANNOTATION_OR_ARGUMENT_IN_OPT_IN")
public typealias ExperimentalKatalogExtApi = com.moriatsushi.katalog.ext.ExperimentalKatalogExtApi
