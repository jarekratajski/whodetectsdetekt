plugins {
    kotlin("jvm") version "1.4.31"
    id("io.gitlab.arturbosch.detekt").version("1.16.0-RC3")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.16.0-RC3")
}

detekt {
    config = files("config/detekt/detekt.yml")
    debug = false
}
