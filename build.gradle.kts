group = "com.noser"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "java")
    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_10
        targetCompatibility = JavaVersion.VERSION_1_10
    }
}

subprojects {
    val moduleName: String by this.extra
    afterEvaluate {
        tasks.withType<JavaCompile> {
            inputs.property("moduleName", moduleName)
            doFirst {
                logger.error("wiiii module $moduleName")
                options.compilerArgs.addAll(arrayOf("--module-path", classpath.asPath))
            }
        }
    }
}

plugins {
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
    compile(project(":a"))
}

