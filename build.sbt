name := "is-scala3"
version := "0.1.0-SNAPSHOT"

scalaVersion := "3.8.1"
scalacOptions ++= List("-feature", "-deprecation", "-source:future")

libraryDependencies += "org.scalameta" %% "munit" % "1.2.2" % Test

ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("17"))
ThisBuild / githubWorkflowBuild := Seq(WorkflowStep.Sbt(name = Some("Build project"), commands = List("test")))

