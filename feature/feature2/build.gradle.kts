plugins {
    alias(libs.plugins.template.android.feature)
    alias(libs.plugins.template.android.compose)
    alias(libs.plugins.template.hilt.plugin)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.android.feature2"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
        targetSdk = 35
    }
}

dependencies {
    implementation(projects.domain)
    implementation(projects.core.designSystem)

    implementation(libs.timber)
}