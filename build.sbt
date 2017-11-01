import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(JavaAppPackaging, AshScriptPlugin, DockerPlugin).
  settings(
    inThisBuild(List(
      organization := "com.pigumer",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    dockerBaseImage := "java:8-jdk-alpine",
    libraryDependencies ++= Seq(akkaHttp, thymeleaf)
  )