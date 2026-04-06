dependencies {
    api(libs.gdx.ai)
    api(libs.gdx.freetype)
    api(libs.gdx)
    api(libs.gdx.tools)

    // Noise4j Library
    api(libs.noise4j)

    // VisUI Library
    api(libs.vis.ui)

    // KTX Libraries
    api(libs.ktx.actors)
    api(libs.ktx.ai)
    api(libs.ktx.app)
    api(libs.ktx.assets.async)
    api(libs.ktx.assets)
    api(libs.ktx.async)
    api(libs.ktx.collections)
    api(libs.ktx.freetype.async)
    api(libs.ktx.freetype)
    api(libs.ktx.graphics)
    api(libs.ktx.i18n)
    api(libs.ktx.inject)
    api(libs.ktx.json)
    api(libs.ktx.log)
    api(libs.ktx.math)
    api(libs.ktx.preferences)
    api(libs.ktx.reflect)
    api(libs.ktx.scene2d)
    api(libs.ktx.style)
    api(libs.ktx.tiled)
    api(libs.ktx.vis.style)
    api(libs.ktx.vis)

    api(libs.koin.core)
    api(libs.tinylog.api)
    // Kotlin Standard Library
    api(libs.kotlin.stdlib)

    // Kotlin Coroutines
    api(libs.kotlinx.coroutines.core)

    // Shared Project Dependency
  api(project(":shared"))

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
