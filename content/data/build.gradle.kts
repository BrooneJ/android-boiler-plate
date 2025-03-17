plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
  namespace = "com.example.content.data"
  compileSdk = 35

  defaultConfig {
    minSdk = 24

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
  kotlinOptions {
    jvmTarget = "11"
  }
}

dependencies {
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.androidx.work)
  implementation(libs.koin.android.workmanager)
  implementation(libs.kotlinx.serialization.json)

  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)

  implementation(projects.core.domain)
  implementation(projects.core.database)
  implementation(projects.content.domain)
}