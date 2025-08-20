package com.android.template

import convention.implementation
import convention.ksp
import convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies


class TemplateHiltPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.dagger.hilt.android")
                apply("com.google.devtools.ksp")
            }

            val libs = extensions.libs

            dependencies {
                implementation(libs.findLibrary("hilt").get())
                ksp(libs.findLibrary("hilt-compiler").get())
            }
        }
    }
}