import org.jetbrains.kotlin.gradle.dsl.JvmTarget

import java.util.Properties

plugins {
    id("com.android.application")
    id("kotlin-android")
}

val appName: String by extra
val gdxVersion: String by project
val dialogsVersion: String by project

android {
    namespace = "net.npg.splitbattle"
    compileSdk = 35

    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            java.setSrcDirs(listOf("src/main/java", "src/main/kotlin"))
            aidl.setSrcDirs(listOf("src/main/java", "src/main/kotlin"))
            renderscript.setSrcDirs(listOf("src/main/java", "src/main/kotlin"))
            res.setSrcDirs(listOf("res"))
            assets.setSrcDirs(listOf("../assets"))
            jniLibs.setSrcDirs(listOf("libs"))
        }
    }

    packaging {
        resources {
            excludes += listOf(
                "META-INF/robovm/ios/robovm.xml",
                "META-INF/DEPENDENCIES.txt",
                "META-INF/DEPENDENCIES",
                "META-INF/dependencies.txt",
                "**/*.gwt.xml"
            )
            pickFirsts += listOf(
                "META-INF/LICENSE.txt",
                "META-INF/LICENSE",
                "META-INF/license.txt",
                "META-INF/LGPL2.1",
                "META-INF/NOTICE.txt",
                "META-INF/NOTICE",
                "META-INF/notice.txt"
            )
        }
    }

    defaultConfig {
        applicationId = "net.npg.splitbattle"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_25
        targetCompatibility = JavaVersion.VERSION_25
        isCoreLibraryDesugaringEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_25)
        }
    }
}

repositories {
    google()
}

val natives by configurations.creating

dependencies {
    "coreLibraryDesugaring"("com.android.tools:desugar_jdk_libs:2.1.5")
    implementation("com.badlogicgames.gdx:gdx-backend-android:$gdxVersion")
    implementation("de.tomgrill.gdxdialogs:gdx-dialogs-android:$dialogsVersion")
    implementation(project(":core"))

    natives("com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-arm64-v8a")
    natives("com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-armeabi-v7a")
    natives("com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-x86")
    natives("com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-x86_64")
    natives("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-arm64-v8a")
    natives("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-armeabi-v7a")
    natives("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-x86")
    natives("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-x86_64")
    natives("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-arm64-v8a")
    natives("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-armeabi-v7a")
    natives("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-x86")
    natives("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-x86_64")
}

tasks.register("copyAndroidNatives") {
    doFirst {
        file("libs/armeabi-v7a/").mkdirs()
        file("libs/arm64-v8a/").mkdirs()
        file("libs/x86_64/").mkdirs()
        file("libs/x86/").mkdirs()

        natives.copy().files.forEach { jar ->
            var outputDir: File? = null
            if (jar.name.endsWith("natives-armeabi-v7a.jar")) outputDir = file("libs/armeabi-v7a")
            if (jar.name.endsWith("natives-arm64-v8a.jar")) outputDir = file("libs/arm64-v8a")
            if (jar.name.endsWith("natives-x86_64.jar")) outputDir = file("libs/x86_64")
            if (jar.name.endsWith("natives-x86.jar")) outputDir = file("libs/x86")

            outputDir?.let { dest ->
                copy {
                    from(zipTree(jar))
                    into(dest)
                    include("*.so")
                }
            }
        }
    }
}

tasks.matching { it.name.contains("merge") && it.name.contains("JniLibFolders") }.configureEach {
    dependsOn("copyAndroidNatives")
}

tasks.register<Exec>("run") {
    var path = ""
    val localProperties = project.file("../local.properties")
    if (localProperties.exists()) {
        val properties = Properties()
        localProperties.inputStream().use { instr ->
            properties.load(instr)
        }
        val sdkDir = properties.getProperty("sdk.dir")
        path = sdkDir ?: System.getenv("ANDROID_SDK_ROOT") ?: ""
    } else {
        path = System.getenv("ANDROID_SDK_ROOT") ?: ""
    }

    val adb = if (path.isNotEmpty()) "$path/platform-tools/adb" else "adb"
    commandLine(adb, "shell", "am", "start", "-n", "net.npg.splitbattle/net.npg.splitbattle.android.AndroidLauncher")
}

configure<org.gradle.plugins.ide.eclipse.model.EclipseModel> {
    project {
        name = "$appName-android"
    }
}
