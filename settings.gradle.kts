pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("org.jetbrains.kotlin.jvm") version "2.0.10"
        id("de.florianmichael.baseproject.BaseProject") version "0.0.3"
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

rootProject.name = "RClasses"

setupSubproject("all")
setupSubproject("io")
setupSubproject("math")
setupSubproject("functional")
setupSubproject("common")
setupSubproject("pattern")
setupSubproject("kotlin-support")
setupSubproject("main")

fun setupSubproject(name: String) {
    include(name)
    project(":$name").projectDir = file("rclasses-$name")
}
