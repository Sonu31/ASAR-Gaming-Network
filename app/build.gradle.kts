plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.asar.gaming.gamingnetwork"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.asar.gaming.gamingnetwork"
        minSdk = 24
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
      buildFeatures {
                  viewBinding = true
              }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("com.github.fornewid:neumorphism:0.3.0")
    implementation ("com.intuit.sdp:sdp-android:1.1.1")
    implementation ("com.github.angads25:toggle:1.1.0")
    implementation ("com.github.kojofosu:SplitButton:1.1")
    implementation ("io.github.florent37:shapeofview:1.4.7")

//    implementation ("com.jjoe64:graphview:4.2.2")

    //Grapsh Library
    implementation ("com.github.Velli20:MaterialUnixGraphLibrary:v1.5")
    //Pic Chart
    implementation ("ir.mahozad.android:pie-chart:0.7.0")



}