plugins {
    kotlin("jvm")
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.compose.compiler)
    application
}

group = "com.moriatsushi.katalog"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(compose.materialIconsExtended)
    implementation(project(":katalog"))
    implementation(project(":extensions:theme"))
}

application {
    mainClass.set("MainKt")
}
