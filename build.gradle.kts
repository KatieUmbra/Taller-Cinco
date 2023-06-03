import org.jetbrains.kotlin.gradle.tasks.UsesKotlinJavaToolchain

plugins {
    kotlin("jvm") version "1.8.21"
    java
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
    testImplementation("junit:junit:4.13.2")
}

val jdkVersion = 20

val service = project.extensions.getByType<JavaToolchainService>()
val customLauncher = service.launcherFor {
    languageVersion.set(JavaLanguageVersion.of(jdkVersion))
}

project.tasks.withType<UsesKotlinJavaToolchain>().configureEach {
    kotlinJavaToolchain.toolchain.use(customLauncher)
}

java {
    sourceCompatibility = JavaVersion.VERSION_20
    targetCompatibility = JavaVersion.VERSION_20
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    }
}

kotlin {
    jvmToolchain(jdkVersion)
}

sourceSets.main {
    java.srcDirs("src/main/java, src/main/kotlin")
}

application {
    mainClass.set("taller.cinco.Main")
}