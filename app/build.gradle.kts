plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
    id("kotlin-parcelize")


}

android {
    namespace = "com.example.githubuserapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.githubuserapp"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    dynamicFeatures += setOf(":favorite")

    buildFeatures {
        viewBinding = true
        //noinspection DataBindingWithoutKapt
        dataBinding = true
    }
    dataBinding {
        enable = true
    }

}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}

dependencies {

    implementation(project(":core"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)

    implementation(libs.viewmodel)
    implementation(libs.viewmodel.runtime)
    implementation(libs.viewmodel.savedstate)
    implementation(libs.viewmodel.common)
    implementation(libs.viewmodel.ext)
    implementation (libs.hdodenhof.circleimageview)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.koin.android.viewmodel)
    implementation(libs.koin)
    implementation(libs.koin.android)
    implementation(libs.life.cycle)
    implementation(libs.koin.fragment)
    implementation(libs.koin.scope)


// Koin
    implementation ("org.koin:koin-androidx-viewmodel:3.1.2")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}