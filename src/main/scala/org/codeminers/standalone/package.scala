package org.codeminers

import io.shiftleft.codepropertygraph.generated.{Cpg, NodeTypes}
import io.shiftleft.codepropertygraph.generated.nodes.Mynodetype
import overflowdb.traversal._

package object standalone {

  implicit def toStandaloneStarters(cpg: Cpg): StandaloneStarters =
    new StandaloneStarters(cpg)

}

class StandaloneStarters(cpg: Cpg) {

  def mynodetype: Traversal[Mynodetype] =
    cpg.graph.nodes(NodeTypes.MYNODETYPE).cast[Mynodetype]

}
