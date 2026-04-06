import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
  repositories {
    mavenCentral()
    maven { url = uri("https://s01.oss.sonatype.org") }
    gradlePluginPortal()
    mavenLocal()
    google()
    maven { url = uri("https://central.sonatype.com/repository/maven-snapshots/") }
  }
  dependencies {
      classpath(libs.kotlin.gradle.plugin)
  }
}

plugins {
    id("org.sonarqube") version libs.versions.sonarqube
    id("com.github.ben-manes.versions") version libs.versions.versions
}

allprojects {
  apply(plugin = "idea")

  // This allows you to "Build and run using IntelliJ IDEA", an option in IDEA's Settings.
  configure<org.gradle.plugins.ide.idea.model.IdeaModel> {
    module {
      outputDir = file("build/classes/java/main")
      testOutputDir = file("build/classes/java/test")
    }
  }
}

configure(subprojects) {
  apply(plugin = "java-library")
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.sonarqube")


  extensions.configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
  }

  tasks.register("generateAssetList") {
        var assetsFolder = File("${project.rootDir}/assets/")
        var assetsFile = File(assetsFolder, "assets.txt")

        inputs.dir(assetsFolder)

    doLast {
      assetsFile.delete()
            assetsFolder.walkTopDown()
                .filter { it.isFile }
                .map { assetsFolder.toPath().relativize(it.toPath()).toString() }
        .sorted()
        .forEach { assetsFile.appendText("$it\n") }
    }
  }
  tasks.named("processResources") {
    dependsOn("generateAssetList")
  }

  tasks.withType<JavaCompile> {
    options.isIncremental = true
  }

    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions.jvmTarget.set(JvmTarget.JVM_25)
  }
}

subprojects {
    version = project.findProperty("projectVersion") as String
    extra["appName"] = "SplitBattle"

  repositories {
    mavenCentral()
        maven { url = uri("https://s01.oss.sonatype.org") }
    mavenLocal()
    maven { url = uri("https://central.sonatype.com/repository/maven-snapshots/") }
    maven { url = uri("https://jitpack.io") }
  }

    sonar {
        properties {
            property("sonar.host.url", "http://172.16.42.7:9000")
}
  }
}
