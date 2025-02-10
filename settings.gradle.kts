pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "Katalog"
include(":katalog")
include(":katalog-androidview")
include(":extensions:theme")
include(":extensions:androidtheme")
include(":extensions:pagesaver")
include(":samples:androidapp")
include(":samples:app")
