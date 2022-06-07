package org.codeminers.standalone

import io.joern.javasrc2cpg.{Config, JavaSrc2Cpg}
import io.joern.x2cpg.X2Cpg.applyDefaultOverlays
import io.shiftleft.semanticcpg.language._

import scala.util.{Failure, Success}

object Main extends App {
  val config = Config(inputPaths = Set("testprogram"))
  JavaSrc2Cpg().createCpg(config) match {
    case Success(cpg) =>
      applyDefaultOverlays(cpg)

      println("Printing all methods:")
      cpg.method.name.foreach(println)

    case Failure(exception) =>
      println(exception)
  }
  println("Hello Joern")
}
