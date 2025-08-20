plugins {
    alias(libs.plugins.template.kotlin.library)
}

dependencies {
    implementation(libs.hilt.core)
    implementation(libs.coroutines.core)
}