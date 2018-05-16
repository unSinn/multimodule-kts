group = "com.noser"
version = "1.0-SNAPSHOT"

plugins {
    java
    application
}

application {
    mainClassName = "com.noser.hello.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_10
}