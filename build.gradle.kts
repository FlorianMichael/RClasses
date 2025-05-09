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

val jis = configureJis()

dependencies {
    // Move all submodules into the jar file
    jis(project(":common"))
    jis(project(":functional"))
    jis(project(":io"))
    jis(project(":math"))
    jis(project(":pattern"))
    jis(project(":kotlin-support"))
}
