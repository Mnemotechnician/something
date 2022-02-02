plugins {
	id("com.android.application")
	kotlin("android")
}

repositories {
	maven("https://jitpack.io")
}

android {
	compileSdkVersion(libs.versions.compile.sdk.version.get().toInt())

	defaultConfig {
		minSdkVersion(libs.versions.min.sdk.version.get().toInt())
		targetSdkVersion(libs.versions.target.sdk.version.get().toInt())

		applicationId = "com.github.mnemotechnician.game"
		versionCode = 1
		versionName = "0.1"
		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}
	buildFeatures {
		viewBinding = true
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}
	kotlinOptions {
		jvmTarget = JavaVersion.VERSION_11.toString()
	}
	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}

	// Use this block to configure different flavors
//	flavorDimensions("version")
//	productFlavors {
//		create("full") {
//			dimension = "version"
//			applicationIdSuffix = ".full"
//		}
//		create("demo") {
//			dimension = "version"
//			applicationIdSuffix = ".demo"
//		}
//	}
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))

	implementation(libs.androidx.appcompat)
	implementation(libs.androidx.constraint.layout)
	implementation(libs.androidx.core.ktx)
	
	implementation("com.github.Anuken.Arc:arc-core:v135")

	/*
	testImplementation(libs.junit)

	androidTestImplementation(libs.androidx.test.ext.junit)
	androidTestImplementation(libs.androidx.test.ext.junit.ktx)
	androidTestImplementation(libs.androidx.test.rules)
	androidTestImplementation(libs.espresso.core)
	*/
}
