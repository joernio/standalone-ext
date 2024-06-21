name := "standalone"
ThisBuild / organization := "org.codeminers"
ThisBuild / scalaVersion := "3.4.2"

// parsed by project/Versions.scala, updated by updateDependencies.sh
val cpgVersion = "1.6.14"
val joernVersion = "2.0.415"
val overflowdbVersion = "1.192"

lazy val schema = Projects.schema
lazy val domainClasses = Projects.domainClasses
lazy val schemaExtender = Projects.schemaExtender

dependsOn(domainClasses)

libraryDependencies ++= Seq(
  "com.github.pathikrit" %% "better-files" % "3.9.2",
  "com.github.scopt" %% "scopt" % "4.1.0",
  "org.apache.logging.log4j" % "log4j-slf4j2-impl" % "2.20.0" % Optional,
  "io.joern" %% "x2cpg" % Versions.joern,
  "io.joern" %% "javasrc2cpg" % Versions.joern,
  "io.joern" %% "joern-cli" % Versions.joern,
  "io.joern" %% "semanticcpg" % Versions.joern,
  "io.joern" %% "semanticcpg" % Versions.joern % Test classifier "tests",
  "org.scalatest" %% "scalatest" % "3.2.16" % Test
)

// mostly so that `sbt assembly` works, but also to ensure that we don't end up
// with unexpected shadowing in jar hell
excludeDependencies ++= Seq(
  ExclusionRule("io.shiftleft", "codepropertygraph-domain-classes_3"),
)

assembly / assemblyMergeStrategy := {
  case "log4j2.xml" => MergeStrategy.first
  case "module-info.class" => MergeStrategy.first
  case "META-INF/versions/9/module-info.class" => MergeStrategy.first
  case "io/github/retronym/java9rtexport/Export.class" => MergeStrategy.first
  case PathList("scala", "collection", "internal", "pprint", _) => MergeStrategy.first
  case x =>
    val oldStrategy = (ThisBuild / assemblyMergeStrategy).value
    oldStrategy(x)
}

ThisBuild / Compile / scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-language:implicitConversions",
)

enablePlugins(JavaAppPackaging)

ThisBuild / licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers ++= Seq(
  Resolver.mavenLocal,
  "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/public",
  "Atlassian" at "https://packages.atlassian.com/mvn/maven-atlassian-external",
  "Gradle Releases" at "https://repo.gradle.org/gradle/libs-releases/"
)

Compile / doc / sources := Seq.empty
Compile / packageDoc / publishArtifact := false
