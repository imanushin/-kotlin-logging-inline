plugins {
    kotlin("multiplatform") version "1.6.0" apply false
    id("org.jetbrains.dokka") version "1.6.0" apply false
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id("io.gitlab.arturbosch.detekt") version "1.18.0" apply false
}

apply("versions.gradle.kts")

apply(plugin = "io.github.gradle-nexus.publish-plugin")

nexusPublishing {
    repositories {
        sonatype()
    }
}

subprojects {
    group = "io.github.imanushin"
    version = "0.0.1"

    repositories {
        mavenCentral()
    }
}


