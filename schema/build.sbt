name := "standalone-schema"

libraryDependencies ++= Seq(
  "io.shiftleft" %% "codepropertygraph-schema" % Versions.cpg,
  "io.joern" %% "flatgraph-domain-classes-generator" % Versions.flatgraph,
)

lazy val generatedSrcDir = settingKey[File]("root for generated sources - we want to check those in")
enablePlugins(FlatgraphCodegenSbtPlugin)
generateDomainClasses / classWithSchema := "CpgExtSchema$"
generateDomainClasses / fieldName       := "instance"
generateDomainClasses/outputDir         := (Projects.domainClasses / generatedSrcDir).value
