Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val `sbt-docker-usage` = (project in file("."))
  .enablePlugins(JavaAppPackaging, DockerPlugin)

organization := "alexr"
name := "sbt-docker-usage"
