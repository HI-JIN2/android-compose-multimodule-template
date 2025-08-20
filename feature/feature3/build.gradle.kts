plugins {
    alias(libs.plugins.satto.android.feature)
    alias(libs.plugins.satto.android.compose)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.hijin.feature3"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
        targetSdk = 35
    }
}

dependencies {

}