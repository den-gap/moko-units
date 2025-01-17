/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("mpp-library-convention")
    id("kotlin-kapt")
    id("stub-javadoc-convention")
    id("publication-convention")
    id("detekt-convention")
}

group = "dev.icerock.moko"
version = libs.versions.mokoUnitsVersion.get()

android.buildFeatures.dataBinding = true

dependencies {
    androidMainImplementation(libs.appCompat)
    androidMainApi(libs.recyclerView)

    // fix of package javax.annotation does not exist import javax.annotation.Generated in DataBinding code
    androidMainCompileOnly(libs.javaxAnnotation)
}
