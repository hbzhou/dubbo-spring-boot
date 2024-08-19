plugins {
    id("springboot.kotlin-conventions")

}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":dubbo-interface"))
}