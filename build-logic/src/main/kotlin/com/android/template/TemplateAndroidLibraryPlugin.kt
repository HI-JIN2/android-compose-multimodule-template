package com.android.template

import convention.configureCoroutineAndroid
import convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project


class TemplateAndroidLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.library")

            configureKotlinAndroid()
            configureCoroutineAndroid()
        }
    }
}
