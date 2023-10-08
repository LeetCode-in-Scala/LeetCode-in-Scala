import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.13.8",
      version      := "1.0"
    )),
    name := "leetcode-scala",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalacticTest % Test
  )
