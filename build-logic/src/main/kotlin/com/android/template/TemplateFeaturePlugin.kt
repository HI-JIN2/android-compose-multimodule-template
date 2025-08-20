package com.android.template

import convention.androidExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


class TemplateFeaturePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("template.android.library")
                apply("template.android.compose")
            }

            androidExtension.apply {
                packaging {
                    resources {
                        excludes.add("META-INF/**")
                    }
                }
                defaultConfig {
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
            }
        }
    }
}
