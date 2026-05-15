plugins {
    alias(uuBuild.plugins.uu.library.app)
}

android {
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(uuBuild.androidx.appcompat)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3.android)
    implementation(libs.androidx.compose.runtime.android)
    implementation(libs.androidx.compose.ui.tooling.preview.android)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.google.material)
    implementation(libs.uu.core.ktx)
    implementation(project(":library"))

    androidTestImplementation(uuBuild.androidx.junit)
    androidTestImplementation(uuBuild.androidx.espresso.core)
}
