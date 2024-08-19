plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.9.24")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.1")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.1.5")
    implementation("org.graalvm.buildtools.native:org.graalvm.buildtools.native.gradle.plugin:0.10.2")

}