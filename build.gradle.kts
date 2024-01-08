buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }

    val kotlinVersion: String by extra
    dependencies {
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.7.3")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven {
            url = uri("http://repository.jetbrains.com/utils")
            isAllowInsecureProtocol = true
        }
        maven {
            url = uri("https://dl.bintray.com/archinamon/maven")
            isAllowInsecureProtocol = true
        }
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/mfadlallah/android-gradle-aspectj")
            credentials {
                username = project.findProperty("gpr.username").toString()
                password = project.findProperty("gpr.token").toString()
            }
        }
    }
}
