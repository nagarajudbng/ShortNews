object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val kotlinBom by lazy { "org.jetbrains.kotlin:kotlin-bom:${Versions.kotlinBom}" }
    val runtimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKtx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUI by lazy { "androidx.compose.ui:ui" }
    val composeUIGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composePreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial by lazy { "androidx.compose.material3:material3" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val composeBom2 by lazy { "androidx.compose:compose-bom:${Versions.composeBom2}" }
    val composeJunit by lazy { "androidx.compose.ui:ui-test-junit4" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val composeUITool by lazy { "androidx.compose.ui:ui-tooling" }
    val composeUITest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val appCompact by lazy { "androidx.appcompat:appcompat:${Versions.appCompact}" }

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
    val hiltAndroidCompiler by lazy {
        "com.google.dagger:hilt-android-compiler:${
            Versions
                .hiltAndroidCompiler
        }"
    }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }

    val hiltNavigationCompose by lazy {
        "androidx.hilt:hilt-navigation-compose:${
            Versions
                .hiltNavigationCompose
        }"
    }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiConverter by lazy {
        "com.squareup.retrofit2:converter-moshi:${
            Versions
                .moshiConverter
        }"
    }
    val loggingInterceptor by lazy {
        "com.squareup.okhttp3:logging-interceptor:${
            Versions
                .loggingInterceptor
        }"
    }

    //Coroutines
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions
        .coroutines}"}
    val coroutinesAndroid by lazy {"org.jetbrains" +
            ".kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"}
}

object Modules{
    const val utilities = ":utilities"
}