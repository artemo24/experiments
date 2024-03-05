group = "com.github.artemo24.experiments"
version = "0.0.6"

plugins {
    kotlin("jvm") version "1.9.22"
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
