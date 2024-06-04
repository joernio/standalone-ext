name := "standalone"
ThisBuild / organization := "org.codeminers"
ThisBuild / scalaVersion := "3.4.2"

// parsed by project/Versions.scala, updated by updateDependencies.sh
val cpgVersion = "1.6.13+13-0bd6923b"
val joernVersion = "2.0.393+25-7e013a49"
val flatgraphVersion = "0.0.61"

lazy val schema = Projects.schema
lazy val domainClasses = Projects.domainClasses
lazy val schemaExtender = Projects.schemaExtender

dependsOn(domainClasses)

libraryDependencies ++= Seq(
  "com.github.pathikrit" %% "better-files" % "3.9.2",
  "com.github.scopt" %% "scopt" % "4.1.0",
  "org.apache.logging.log4j" % "log4j-slf4j2-impl" % "2.20.0" % Optional,
// TODO change organization back from temporary `com.michaelpollmeier`
  "com.michaelpollmeier" %% "x2cpg" % Versions.joern,
  "com.michaelpollmeier" %% "javasrc2cpg" % Versions.joern,
  "com.michaelpollmeier" %% "joern-cli" % Versions.joern,
  "com.michaelpollmeier" %% "semanticcpg" % Versions.joern,
  "com.michaelpollmeier" %% "semanticcpg" % Versions.joern % Test classifier "tests",
  "org.scalatest" %% "scalatest" % "3.2.16" % Test
)

// mostly so that `sbt assembly` works, but also to ensure that we don't end up
// with unexpected shadowing in jar hell
excludeDependencies ++= Seq(
// TODO remove temporary rule for `com.michaelpollmeier`
  ExclusionRule("com.michaelpollmeier", "codepropertygraph-domain-classes_3"),
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
