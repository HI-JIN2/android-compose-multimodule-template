plugins {
    alias(libs.plugins.template.kotlin.library)
}

dependencies {
    implementation(projects.domain)

    implementation(libs.hilt.core)
    implementation(libs.coroutines.core)
}