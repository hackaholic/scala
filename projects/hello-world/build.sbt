val scala3Version = "3.7.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-world",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("org.scalameta" %% "munit" % "1.0.0" % Test,
                                "com.lihaoyi" %% "os-lib" % "0.9.1"
                          )
    
  )
