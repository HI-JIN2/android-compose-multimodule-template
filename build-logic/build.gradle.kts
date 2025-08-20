plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("templateAndroidApplication") {
            id = "template.android.application"
            implementationClass = "com.android.template.TemplateAndroidApplicationPlugin"
        }
        register("templateAndroidLibrary") {
            id = "template.android.library"
            implementationClass = "com.android.template.TemplateAndroidLibraryPlugin"
        }
        register("templateComposePlugin") {
            id = "template.android.compose"
            implementationClass = "com.android.template.TemplateComposePlugin"
        }
        register("templateFeaturePlugin") {
            id = "template.android.feature"
            implementationClass = "com.android.template.TemplateFeaturePlugin"
        }
        register("templateKotlinLibrary") {
            id = "template.kotlin.library"
            implementationClass = "com.android.template.TemplateKotlinLibraryPlugin"
        }
    }
}