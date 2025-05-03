pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

rootProject.name = "RClasses"

includeBuild("build-logic")

setupSubproject("all")
setupSubproject("io")
setupSubproject("math")
setupSubproject("functional")
setupSubproject("common")
setupSubproject("pattern")
setupSubproject("kotlin-support")
setupSubproject("main")

inline fun setupSubproject(name: String) {
    include(name)
    project(":$name").projectDir = file("rclasses-$name")
}
