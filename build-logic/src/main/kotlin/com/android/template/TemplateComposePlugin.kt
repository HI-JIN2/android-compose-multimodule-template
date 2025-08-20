package com.android.template

import convention.configureComposeAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project


class TemplateComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configureComposeAndroid()
        }
    }
}
