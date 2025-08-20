package com.android.template

import convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project


class TemplateAndroidApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
            }

            configureKotlinAndroid()
        }
    }
}
