group = "com.noser"
version = "1.0-SNAPSHOT"

val moduleName by extra { "com.noser.hello" }

extra["moduleName"] = "com.noser.hello"


buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "com.zyxist.chainsaw")

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_10
        targetCompatibility = JavaVersion.VERSION_1_10
    }
}

repositories {
    mavenCentral()
    jcenter()
}

plugins {
    application
    id("com.zyxist.chainsaw") version "0.3.1"
}

application {
    mainClassName = "com.noser.hello.Main"
}

dependencies {
    testCompile("junit", "junit", "4.12")
    compile(project(":a"))
}

