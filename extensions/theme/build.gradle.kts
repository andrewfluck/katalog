plugins {
    id("com.android.library")
//    id("com.vanniktech.maven.publish")
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.compose.compiler)
}

kotlin {
    applyDefaultHierarchyTemplate()
    jvmToolchain(17)

    androidTarget()
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                implementation(project(":katalog"))

                implementation(compose.ui)
                implementation(compose.uiTooling)
                implementation(compose.foundation)
                implementation(compose.material)
            }
        }

        val androidMain by getting
    }
}

android {
    compileSdk = 34
    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
        getByName("test").java.srcDir("src/test/kotlin")
        getByName("androidTest").java.srcDir("src/androidTest/kotlin")
    }
    namespace = "com.moriatsushi.ext.theme"
}

dependencies {
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.androidx.test.runner)
    testImplementation(libs.androidx.test.rules)
    testImplementation(libs.androidx.test.ext.junit)
    testImplementation(libs.androidx.test.ext.truth)
}
