plugins {
    id("java")
}

group = "com.test.http"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(libs.okhttp.core)
    implementation(libs.gson)
}

tasks.test {
    useJUnitPlatform()
}