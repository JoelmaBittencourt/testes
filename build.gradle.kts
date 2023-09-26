plugins {
	java
	id("org.springframework.boot") version "3.0.11"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
