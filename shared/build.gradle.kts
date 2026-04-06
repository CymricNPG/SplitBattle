plugins {
    kotlin("plugin.serialization") version libs.versions.kotlin
}

dependencies {
    // Kotlin Library
    implementation(libs.kotlin.stdlib)

    // Commons Lang3
    implementation(libs.commons.lang3)

    // Logging
    implementation(libs.tinylog.api)

    // JNoise
    implementation(libs.noise4j)

    // Koin Dependencies
    implementation(libs.koin.core)
    implementation(libs.koin.logger.slf4j)

    // Serialization
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.gdx.ai)
    implementation(libs.gdx)

    // Test Dependencies
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.koin.test.junit5)
    testImplementation(libs.assertj.core)
    testImplementation(libs.mockk)
    testImplementation(kotlin("test"))

}

tasks.withType<Test> {
    useJUnitPlatform()
}
