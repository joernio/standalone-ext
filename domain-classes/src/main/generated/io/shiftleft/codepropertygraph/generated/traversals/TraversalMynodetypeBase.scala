package io.shiftleft.codepropertygraph.generated.traversals

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*

final class TraversalMynodetypeBase[NodeType <: nodes.MynodetypeBase](val traversal: Iterator[NodeType])
    extends AnyVal {

  /** Traverse to myproperty property */
  def myproperty: Iterator[String] =
    traversal.map(_.myproperty)

  /** Traverse to nodes where the myproperty matches the regular expression `value`
    */
  def myproperty(pattern: String): Iterator[NodeType] =
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      mypropertyExact(pattern)
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filter { item => matcher.reset(item.myproperty).matches }
    }

  /** Traverse to nodes where the myproperty matches at least one of the regular expressions in `values`
    */
  def myproperty(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.exists { _.reset(item.myproperty).matches } }
  }

  /** Traverse to nodes where myproperty matches `value` exactly.
    */
  def mypropertyExact(value: String): Iterator[NodeType] = traversal match {
    case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
      val someNode = init.next
      flatgraph.Accessors
        .getWithInverseIndex(someNode.graph, someNode.nodeKind, 39, value)
        .asInstanceOf[Iterator[NodeType]]
    case _ => traversal.filter { _.myproperty == value }
  }

  /** Traverse to nodes where myproperty matches one of the elements in `values` exactly.
    */
  def mypropertyExact(values: String*): Iterator[NodeType] =
    if (values.length == 1) mypropertyExact(values.head)
    else {
      val valueSet = values.toSet
      traversal.filter { item => valueSet.contains(item.myproperty) }
    }

  /** Traverse to nodes where myproperty does not match the regular expression `value`.
    */
  def mypropertyNot(pattern: String): Iterator[NodeType] = {
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      traversal.filter { node => node.myproperty != pattern }
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filterNot { item => matcher.reset(item.myproperty).matches }
    }
  }

  /** Traverse to nodes where myproperty does not match any of the regular expressions in `values`.
    */
  def mypropertyNot(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.find { _.reset(item.myproperty).matches }.isEmpty }
  }

}
