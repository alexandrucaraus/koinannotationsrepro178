plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {

            implementation(projects.moduleA)
            implementation(projects.moduleB)

            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.materialIconsExtended)


            implementation(libs.compose.navigation)
            implementation(libs.compose.navigation.common)

            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose)
            implementation(libs.koin.compose.viewmodel)
            api(libs.koin.annotations)

        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        androidMain.dependencies {
            implementation(libs.koin.android)
        }
    }
}

android {
    namespace = "de.test.koinannotationsrepro178"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
