plugins {
    `java-library`
    id("rclasses.base-conventions")
}

val library: Configuration by configurations.creating {
    configurations.api.get().extendsFrom(this)
    configurations.implementation.get().extendsFrom(this)
}

dependencies {
    // Move all submodules into the jar file
    library(project(":common"))
    library(project(":functional"))
    library(project(":io"))
    library(project(":math"))
    library(project(":pattern"))
    library(project(":kotlin-support"))
}

tasks {
    jar {
        val projectName = project.name

        // Add all dependencies which are included using "library" to the jar file and exclude the META-INF folder
        dependsOn(library)
        from({
            library.map { zipTree(it) }
        }) {
            exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
        }

        duplicatesStrategy = DuplicatesStrategy.EXCLUDE

        // Rename the project's license file to LICENSE_<project_name> to avoid conflicts
        from("LICENSE") {
            rename { "LICENSE_${projectName}" }
        }
    }
}
