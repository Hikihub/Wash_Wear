plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.wash_wear"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.wash_wear"
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
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // ----- Importing scalable unit
    implementation(libs.sdp.android)

    // ------ Importing material design dependency

    implementation (libs.material.v1110)
    // ------ Importing country code picker
    implementation(libs.ccp)

    // ---- Importing Pin view
    implementation (libs.pinview)

    //Round image
    implementation(libs.roundedimageview)

    //Animated image
    implementation(libs.lottie)

    //sizes for different screens
    implementation(libs.ssp.android)
    implementation(libs.sdp.android)

    //Navigation UI
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.picasso)
    implementation(libs.glide)

    //Navigation Fragment
    implementation(libs.navigation.fragment.ktx)

    //Firebase Authentication
    implementation(libs.firebase.auth.v2105)

    //Firebase Fire station
    implementation(libs.firestore.firestore)

    //Firebase SDK for using Firebase services (e.g. , Analytics, Messaging, etc)
    implementation(libs.firebase.core)

    //Optional : Firebase UI for Authentication UI
    implementation(libs.firebase.ui.auth)


}