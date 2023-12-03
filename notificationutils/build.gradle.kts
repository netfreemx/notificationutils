/*
 * Created by Cristian Gonzalez on &amp;#36;today&#10; Copyright (c) &amp;#36;today.year NetFree Mexico. All rights reserved.
 */

plugins {
    id("com.android.library")
    id("maven-publish")
}

android {
    namespace = "com.netfreemexico.notificationutils"
    compileSdk = 33

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.netfreemexico"
            artifactId = "notificationutils"
            version = "1.0.0"
        }
    }
}

dependencies {

    api("androidx.appcompat:appcompat:1.6.1")
    api("com.google.firebase:firebase-messaging:23.3.1")
    implementation("androidx.preference:preference:1.2.1")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}