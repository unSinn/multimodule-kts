group = "com.noser.b"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    compile(project(":c"))
    testCompile("junit", "junit", "4.12")
}