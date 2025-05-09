import de.florianmichael.baseproject.*

plugins {
    base
    id("de.florianmichael.baseproject.BaseProject")
}

subprojects {

    setupProject()
    setupPublishing()

    repositories {
        mavenCentral()
    }

    apply(plugin = "base")
    base {
        archivesName.set("RClasses-" + project.name)
    }
}

setupProject()

val shade = configureShadedDependencies()

dependencies {
    // Move all submodules into the jar file
    shade(project(":common"))
    shade(project(":functional"))
    shade(project(":io"))
    shade(project(":math"))
    shade(project(":pattern"))
    shade(project(":kotlin-support"))
}
