package org.codeminers.standalone

import better.files.{File => F}
import io.shiftleft.codepropertygraph.generated.EdgeTypes
import io.shiftleft.codepropertygraph.generated.nodes.NewLiteral
import io.shiftleft.semanticcpg.language.*
import io.shiftleft.semanticcpg.testing.MockCpg
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MyTest extends AnyWordSpec with Matchers {

  "Foo" should {

    "description1" in {
      val cpg = MockCpg()
        .withMethod("foo")
        .withCallInMethod("foo", "bar")
        .withCustom { case (diffGraph, cpg) =>
          val literal = NewLiteral().code("abc")
          diffGraph.addNode(literal)
          val block = cpg.method.block.head
          diffGraph.addEdge(block, literal, EdgeTypes.AST)
        }
        .cpg
      cpg.method.block.astChildren.isLiteral.foreach(println)
    }

    "description2" in {
      F.usingTemporaryFile("standalone") { file =>
        println(file)
      }
    }
  }

}
