plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.ktlint) apply false
}

// Convenience aggregate tasks (so you can run `./gradlew ktlintCheck` at the repo root)
tasks.register("ktlintCheck") {
    group = "verification"
    description = "Runs ktlint checks for all subprojects."
}

tasks.register("ktlintFormat") {
    group = "formatting"
    description = "Runs ktlint auto-format for all subprojects."
}

subprojects {
    plugins.withId("org.jlleitschuh.gradle.ktlint") {
        rootProject.tasks.named("ktlintCheck").configure { dependsOn(tasks.named("ktlintCheck")) }
        rootProject.tasks.named("ktlintFormat").configure { dependsOn(tasks.named("ktlintFormat")) }
    }
}
