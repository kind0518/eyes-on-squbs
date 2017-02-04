import Versions._

name := "eyes-on-squbs"

organization in ThisBuild := "co.idiots"

version in ThisBuild := "0.8.0"

scalaVersion in ThisBuild := "2.11.8"


parallelExecution in Test := false

fork in Test := false

lazy val `eyes-on-message` = project

lazy val `eyes-on-test` = project

lazy val `eyes-on-json` = project

lazy val `eyes-on-util` = project

lazy val `eyes-on-backend` = project.dependsOn(`eyes-on-message`, `eyes-on-json`, `eyes-on-util`)

lazy val `eyes-on-frontend` = project.dependsOn(`eyes-on-message`, `eyes-on-json`, `eyes-on-util`)

lazy val root = project.in(file("."))
  .dependsOn(`eyes-on-message`, `eyes-on-json`, `eyes-on-util`, `eyes-on-backend`, `eyes-on-frontend`)
  .aggregate(`eyes-on-message`, `eyes-on-json`, `eyes-on-util`, `eyes-on-backend`, `eyes-on-frontend`)

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % akka)








/*


import Versions._

name := "awair-squbs"

organization in ThisBuild := "co.bitfinder"

version in ThisBuild := "0.8.0"

scalaVersion in ThisBuild := "2.11.8"

parallelExecution in Test := false
fork in Test := false

lazy val `awair-message` = project

lazy val `awair-json` = project

lazy val `awair-util` = project.dependsOn(`awair-message`, `awair-json`)

lazy val `awair-mobile-push` = project.dependsOn(`awair-message`, `awair-util`, `awair-json`)

lazy val `awair-kafka` = project.dependsOn(`awair-message`, `awair-util`, `awair-json`)

lazy val `awair-backend` = project.dependsOn(`awair-message`, `awair-util`, `awair-json`)

lazy val `awair-frontend` = project.dependsOn(`awair-message`, `awair-util`, `awair-json`)

lazy val `awair-mqtt` = project.dependsOn(`awair-message`, `awair-util`, `awair-json`)

lazy val root = project.in(file("."))
  .dependsOn(`awair-mqtt`, `awair-frontend`, `awair-backend`, `awair-kafka`, `awair-mobile-push`, `awair-message`, `awair-util`, `awair-json`)
  .aggregate(`awair-mqtt`, `awair-frontend`, `awair-backend`, `awair-kafka`, `awair-mobile-push`, `awair-message`, `awair-util`, `awair-json`)

mainClass in Compile := Some("co.bitfinder.awair.squbs.Bootstrap")

enablePlugins(JavaAgent, JavaAppPackaging)
javaAgents += "org.aspectj" % "aspectjweaver" % aspectjweaver

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akka,
  "io.kamon" %% "kamon-core" % kamon,
  "io.kamon" %% "kamon-akka" % kamon,
  "io.kamon" %% "kamon-datadog" % kamon,
  "io.kamon" %% "kamon-system-metrics" % kamon,
  "org.aspectj" % "aspectjweaver" % aspectjweaver)

 */