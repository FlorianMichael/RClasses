plugins {
    `java-library`
}

group = property("maven_group") as String
version = property("maven_version") as String
description = property("maven_description") as String

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
