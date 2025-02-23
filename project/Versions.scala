object Versions {
  val cpg       = parseVersion("cpgVersion")
  val joern     = parseVersion("joernVersion")
  val flatgraph = parseVersion("flatgraphVersion")

  private def parseVersion(key: String): String = {
    val versionRegexp = s""".*val $key[ ]+=[ ]?"(.*?)"""".r
    val versions: List[String] = scala.io.Source
      .fromFile("build.sbt")
      .getLines
      .filter(_.contains(s"val $key"))
      .collect { case versionRegexp(version) => version }
      .toList
    assert(
      versions.size == 1,
      s"""unable to extract $key from build.sbt, expected exactly one line like `val $key= "0.0.0-SNAPSHOT"`."""
    )
    versions.head
  }

  val log4j     = "2.24.3"
  val scalatest = "3.2.19"
  val scopt     = "4.1.0"
}
