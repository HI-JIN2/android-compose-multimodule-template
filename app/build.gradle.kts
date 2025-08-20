plugins {
    alias(libs.plugins.satto.android.application)
    alias(libs.plugins.satto.android.compose)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.hijin.android_templete"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.hijin.android_templete"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        create("release") {

        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isDebuggable = false
        }
    }

    composeCompiler {
        reportsDestination = layout.buildDirectory.dir("compose_compiler")
    }
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)
    implementation(projects.core.designSystem)
    implementation(projects.feature.feature1)
    implementation(projects.feature.feature2)
    implementation(projects.feature.feature3)
//    implementation(projects.local)
//    implementation(projects.remote)
}