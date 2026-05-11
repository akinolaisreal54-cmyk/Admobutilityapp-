plugins {
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
    kotlin("android") version "1.5.31" apply false
}
// Top-level build file where you can add configuration options common to all sub-projects/module

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

