import sbt.Keys.libraryDependencies

import java.util.Calendar

ThisBuild / scalaVersion := "3.3.0"
ThisBuild / version := "1.0.0"
ThisBuild / organization := "com.stulsoft"
ThisBuild / organizationName := "stulsoft"

lazy val root = (project in file("."))
  .settings(
    name := "ys-jfreechart",
    libraryDependencies += "com.stulsoft" %% "common" % "latest.integration",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.7",
    libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
    libraryDependencies += "org.jfree" % "jfreechart" % "1.5.4",

    libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.15" % Test
  )

Compile / packageBin / packageOptions += Package.ManifestAttributes("Build-Date" -> Calendar.getInstance().getTime.toString)