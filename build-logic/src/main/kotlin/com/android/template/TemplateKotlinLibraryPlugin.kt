package com.android.template

import convention.configurePureKotlin
import org.gradle.api.Plugin
import org.gradle.api.Project


class TemplateKotlinLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configurePureKotlin()
        }
    }
}