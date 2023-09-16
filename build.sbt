ThisBuild / scalaVersion := "2.13.12"

ThisBuild / version := "1.0.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-framework-scala-playground""",
    libraryDependencies ++= Seq(
      guice,
      "com.google.inject" % "guice" % "5.1.0",
      "com.google.inject.extensions" % "guice-assistedinject" % "5.1.0",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
    )
  )