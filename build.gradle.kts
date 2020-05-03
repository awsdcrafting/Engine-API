plugins {
    java
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.serialization") version "1.3.72"
}

group = "eu.scisneromam"
version = "1.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    val sourcesJar by creating(Jar::class) {
        dependsOn(JavaPlugin.CLASSES_TASK_NAME)
        classifier = "sources"
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }
    val javadocJar by creating(Jar::class) {
        val javadoc by tasks;
        from(javadoc);
        classifier = "javadoc";
        archiveClassifier.set("javadoc")
    }

    artifacts {
        add("archives", sourcesJar)
        add("archives", javadocJar)
    }
}