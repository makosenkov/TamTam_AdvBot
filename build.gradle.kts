import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.net.URI

plugins {
    kotlin("jvm") version "1.3.50"
}

group = "me.evgen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
//    maven { url = URI("http://dl.bintray.com/kotlin/kotlin-eap/") }
//    maven { url = URI("http://dl.bintray.com/kotlin/ktor") }
    maven { url = URI("https://dl.bintray.com/kotlin/kotlinx") }
    maven { url = URI("https://plugins.gradle.org/m2/") }
    jcenter()
    maven { url = URI("https://oss.jfrog.org//artifactory/oss-snapshot-local") }
}

dependencies {

    testImplementation(kotlin("test-junit5"))
    implementation ("com.namazed.botsdk:library:0.4.0")
    implementation(kotlin("stdlib-jdk8"))
    implementation("ch.qos.logback:logback-classic:1.2.1")
    implementation("com.h2database:h2:1.4.197")
    implementation("org.jetbrains.exposed:exposed:0.11.2")
    implementation("com.squareup.okhttp3:logging-interceptor:3.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.14.0")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


