name := "functional-mess"

version := "0.1"

scalaVersion := "2.12.6"

val Http4sVersion = "0.18.11"
val Specs2Version = "4.2.0"
val LogbackVersion = "1.2.3"


libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "org.specs2" %% "specs2-core" % Specs2Version % "test",
  "ch.qos.logback" % "logback-classic" % LogbackVersion
)
