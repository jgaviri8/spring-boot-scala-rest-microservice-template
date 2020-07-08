name := "scala-rest-microservice-template"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.3.1.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-tomcat" % "2.3.1.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "2.3.1.RELEASE",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.13" % "2.11.1",
  "com.h2database" % "h2"  % "1.4.197" % Runtime
)

scalacOptions ++= Seq(
  "-language:implicitConversions",
  "-language:postfixOps"
)