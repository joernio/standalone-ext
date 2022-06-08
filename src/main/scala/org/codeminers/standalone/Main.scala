package org.codeminers.standalone

import io.joern.javasrc2cpg.{Config, JavaSrc2Cpg}
import io.joern.x2cpg.X2Cpg.applyDefaultOverlays
import io.shiftleft.codepropertygraph.generated.Cpg
import io.shiftleft.codepropertygraph.generated.nodes.NewMynodetype
import io.shiftleft.passes.SimpleCpgPass
import io.shiftleft.semanticcpg.language._
import overflowdb.BatchedUpdate

import scala.jdk.CollectionConverters._
import scala.util.{Failure, Success}

object Main extends App {
  val config = Config(inputPaths = Set("testprogram"))
  JavaSrc2Cpg().createCpg(config) match {
    case Success(cpg) =>
      applyDefaultOverlays(cpg)

      println("Printing all methods:")
      cpg.method.name.foreach(println)

      println("Running a custom pass to add some custom nodes")
      new MyPass(cpg).createAndApply()
      cpg.graph.nodes().asScala.toList.foreach(println)

    case Failure(exception) =>
      println(exception)
  }
  println("Hello Joern")
}

class MyPass(cpg: Cpg) extends SimpleCpgPass(cpg) {
  override def run(builder: BatchedUpdate.DiffGraphBuilder): Unit = {
    val n = NewMynodetype().myproperty("foo")
    builder.addNode(n)
  }
}
