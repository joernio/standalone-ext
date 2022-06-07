name := "standalone"
ThisBuild/organization := "org.codeminers"
ThisBuild/scalaVersion := "2.13.7"

// parsed by project/Versions.scala, updated by updateDependencies.sh
val cpgVersion = "1.3.537"
val joernVersion = "1.1.852"
val overflowdbVersion = "1.127"

lazy val schema = project.in(file("schema"))
lazy val domainClasses = project.in(file("domain-classes"))
lazy val schemaExtender = project.in(file("schema-extender"))

dependsOn(domainClasses)

libraryDependencies ++= Seq(
  "com.github.pathikrit" %% "better-files" % "3.9.1",
  "com.github.scopt" %% "scopt" % "3.7.1",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.17.1" % Runtime,
  "io.joern" %% "x2cpg" % Versions.joern,
  "io.joern" %% "javasrc2cpg" % Versions.joern,
  "io.joern" %% "joern-cli" % Versions.joern,
  "io.joern" %% "semanticcpg" % Versions.joern,
  "io.joern" %% "semanticcpg" % Versions.joern % Test classifier "tests",
  "org.scalatest" %% "scalatest" % "3.1.1" % Test
)

ThisBuild/Compile/scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-language:implicitConversions",
)

enablePlugins(JavaAppPackaging)

ThisBuild/licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

Global/onChangedBuildSource := ReloadOnSourceChanges

ThisBuild/resolvers ++= Seq(
  Resolver.mavenLocal,
  "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/public")
