plugins {
    `java-library`
    id("rclasses.base-conventions")
}

val exportToJar: Configuration by configurations.creating {
    configurations.api.get().extendsFrom(this)
    configurations.implementation.get().extendsFrom(this)
}

dependencies {
    // Move all submodules into the jar file
    exportToJar(project(":common"))
    exportToJar(project(":functional"))
    exportToJar(project(":io"))
    exportToJar(project(":math"))
    exportToJar(project(":pattern"))
    exportToJar(project(":kotlin-support"))
}

tasks {
    jar {
        val projectName = project.name

        // Add all dependencies which are included using "exportToJar" to the jar file and exclude the META-INF folder
        dependsOn(exportToJar)
        from({
            exportToJar.map { zipTree(it) }
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
