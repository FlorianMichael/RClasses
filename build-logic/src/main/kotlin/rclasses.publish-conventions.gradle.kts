plugins {
    id("rclasses.base-conventions")
    `maven-publish`
    signing
}


base {
    archivesName.set("RClasses-" + project.name)
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks {
    withType<PublishToMavenRepository>().configureEach {
        dependsOn(withType<Sign>())
    }
}

publishing {
    repositories {
        maven {
            name = "reposilite"
            url = uri("https://maven.lenni0451.net/" + if (version.toString().endsWith("SNAPSHOT")) "snapshots" else "releases")
            credentials(PasswordCredentials::class)
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
        maven {
            name = "ossrh"
            val releasesUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            val snapshotsUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
            url = uri(if (version.toString().endsWith("SNAPSHOT")) snapshotsUrl else releasesUrl)
            credentials(PasswordCredentials::class)
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])

            pom {
                name.set(artifactId)
                description.set(project.description)
                url.set("https://github.com/FlorianMichael/RClasses")
                licenses {
                    license {
                        name.set("Apache-2.0 license")
                        url.set("https://github.com/FlorianMichael/RClasses/blob/main/LICENSE")
                    }
                }
                developers {
                    developer {
                        id.set("FlorianMichael")
                        name.set("EnZaXD")
                        email.set("florian.michael07@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/FlorianMichael/RClasses.git")
                    developerConnection.set("scm:git:ssh://github.com/FlorianMichael/RClasses.git")
                    url.set("https://github.com/FlorianMichael/RClasses")
                }
            }
        }
    }
}

signing {
    isRequired = false
    sign(publishing.publications["maven"])
}
