package jp.co.cyberagent.katalog

import com.moriatsushi.katalog.dsl.Group
import com.moriatsushi.katalog.group
import com.moriatsushi.katalog.registerKatalog
import jp.co.cyberagent.katalog.dsl.GroupDefinition
import jp.co.cyberagent.katalog.ext.KatalogExt

private const val DEFAULT_TITLE = "Katalog"

@Deprecated(
    "The package name has changed.",
    ReplaceWith(
        "registerKatalog(title, extensions, groupDefinition)",
        "com.moriatsushi.jp.co.cyberagent.katalog.registerKatalog",
    ),
)
public fun registerKatalog(
    title: String = DEFAULT_TITLE,
    extensions: List<KatalogExt> = emptyList(),
    groupDefinition: GroupDefinition,
) {
    registerKatalog(
        title = title,
        extensions = extensions,
        groupDefinition = groupDefinition,
    )
}

@Deprecated(
    "The package name has changed.",
    ReplaceWith(
        "group(name, definition)",
        "com.moriatsushi.jp.co.cyberagent.katalog.group",
    ),
)
public fun group(name: String, definition: GroupDefinition): Group {
    return group(
        name = name,
        definition = definition,
    )
}
