name := "standalone-schema"

// TODO change organization back from temporary `com.michaelpollmeier`
libraryDependencies ++= Seq(
  "com.michaelpollmeier" %% "codepropertygraph-schema" % Versions.cpg,
  "io.joern" %% "flatgraph-domain-classes-generator" % Versions.flatgraph,
)

lazy val generatedSrcDir = settingKey[File]("root for generated sources - we want to check those in")
enablePlugins(FlatgraphCodegenSbtPlugin)
generateDomainClasses / classWithSchema := "CpgExtSchema$"
generateDomainClasses / fieldName       := "instance"
generateDomainClasses/outputDir         := (Projects.domainClasses / generatedSrcDir).value
