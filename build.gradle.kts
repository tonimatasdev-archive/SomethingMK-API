plugins {
    java
    `maven-publish`
}

group = "dev.tonimatas"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.1.2")
    implementation("com.google.code.gson:gson:2.11.0")
    
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
}
