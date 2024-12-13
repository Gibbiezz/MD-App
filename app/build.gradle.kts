

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33

android {
    namespace = "com.example.gibbiez"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gibbiez"
        minSdk = 21
        targetSdk = 33
        versionCode =1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
        buildTypes {
            release {

            }
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    implementation("androidx.camera:camera-core:1.2.1")
    implementation("androidx.camera:camera-view:1.2.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("androidx.camera:camera-lifecycle:1.0.0")
    implementation("androidx.camera:camera-view:1.0.0")
    implementation(libs.androidx.camera.lifecycle)
}
