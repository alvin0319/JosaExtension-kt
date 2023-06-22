plugins {
    kotlin("jvm") version "1.8.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    `maven-publish`
}

group = "dev.minjae.josaextension"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "jitpack"
        url = uri("https://jitpack.io")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.b1uec0in:JosaFormatter:1.7")
}

publishing {
    repositories {
        maven {
            url = uri("https://repo.minjae.dev/snapshots")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("PASSWORD")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            groupId = "dev.minjae.josaextension"
            artifactId = "josaextension"
            version = "1.0-SNAPSHOT"
            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
