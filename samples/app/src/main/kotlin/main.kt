import com.moriatsushi.katalog.compose.katalogApplication
import com.moriatsushi.katalog.ext.theme.ThemeExt
import sample.SampleTheme
import sample.compose.material.composeMaterialGroup

fun main() = katalogApplication(
    title = "Android Sample",
    extensions = listOf(
        ThemeExt { SampleTheme(it) },
    ),
    groupDefinition = {
        group(
            composeMaterialGroup,
        )
    }
)
