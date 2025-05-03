plugins {
    id("rclasses.publish-conventions")
}

dependencies {
    // Add all submodules as api dependencies
    api(project(":common"))
    api(project(":functional"))
    api(project(":io"))
    api(project(":math"))
    api(project(":pattern"))
    api(project(":kotlin-support"))
}
