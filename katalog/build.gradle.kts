plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.compose.compiler)
//    alias(libs.plugins.publish)
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

                implementation(compose.foundation)
                implementation(compose.ui)
                implementation(compose.uiTooling)
                implementation(compose.material)
                implementation(compose.materialIconsExtended)
                implementation("org.jetbrains.androidx.lifecycle:lifecycle-viewmodel-compose:2.8.2")
            }
        }

        val commonJvmMain by creating {
            dependsOn(commonMain)
        }

        val jvmMain by getting {
            dependsOn(commonJvmMain)
        }

        val androidMain by getting {
            dependsOn(commonJvmMain)

            dependencies {
                implementation(libs.kotlinx.coroutines.android)

                implementation(libs.androidx.core)
                implementation(libs.androidx.activity)
                implementation(libs.androidx.activity.compose)

                implementation(libs.androidx.lifecycle.viewmodel)
                implementation(libs.androidx.lifecycle.viewmodel.compose)

                implementation(libs.androidx.annotation)

                implementation(libs.material)
            }
        }
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
//    kotlinOptions {
//        jvmTarget = "17"
//        freeCompilerArgs = freeCompilerArgs + listOf(
//            "-Xexplicit-api=strict",
//            "-Xopt-in=kotlin.RequiresOptIn"
//        )
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion =
//            libs.versions.androidx.compose.compiler.get()
//    }
    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
        getByName("test").java.srcDir("src/test/kotlin")
        getByName("androidTest").java.srcDir("src/androidTest/kotlin")
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }

    namespace = "com.moriatsushi.katalog"
}

dependencies {
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.androidx.test.runner)
    testImplementation(libs.androidx.test.rules)
    testImplementation(libs.androidx.test.ext.junit)
    testImplementation(libs.androidx.test.ext.truth)

    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.androidx.compose.ui.test)
    testImplementation(libs.androidx.compose.ui.test.manifest)
    testImplementation(libs.robolectric)
}
