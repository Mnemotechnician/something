import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

buildscript {
	repositories {
		google()
		mavenCentral()
	}
	
	dependencies {
		classpath("com.android.tools.build:gradle:7.0.3")
	}
}

plugins {
	kotlin("android") version "1.6.10" apply false
	//id("com.android.application") apply false
	//id("com.android.library") apply false
	alias(libs.plugins.versions)
	base
}

repositories {
	google()
}

allprojects {
	//group = PUBLISHING_GROUP
}

tasks {
	withType<DependencyUpdatesTask>().configureEach {
		/*rejectVersionIf {
			candidate.version.isStableVersion().not()
		}*/
	}
}
