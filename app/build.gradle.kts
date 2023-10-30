plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.weather0119deh"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.weather0119deh"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation ("org.litepal.android:java:1.4.1")//对数据库进行的操作
    implementation ("com.squareup.okhttp3:okhttp:3.4.1")//进行网络请求
    implementation ("com.google.code.gson:gson:2.8.6")//解析JSON数据
    implementation ("com.github.bumptech.glide:glide:4.11.0")//加载和展示图片
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(files("libs\\litepal-1.4.1.jar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}