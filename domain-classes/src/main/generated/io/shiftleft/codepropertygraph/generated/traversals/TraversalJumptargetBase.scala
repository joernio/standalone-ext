package io.shiftleft.codepropertygraph.generated.traversals

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*

final class TraversalJumptargetBase[NodeType <: nodes.JumpTargetBase](val traversal: Iterator[NodeType])
    extends AnyVal {

  /** Traverse to argumentIndex property */
  def argumentIndex: Iterator[Int] =
    traversal.map(_.argumentIndex)

  /** Traverse to nodes where the argumentIndex equals the given `value`
    */
  def argumentIndex(value: Int): Iterator[NodeType] =
    traversal.filter { _.argumentIndex == value }

  /** Traverse to nodes where the argumentIndex equals at least one of the given `values`
    */
  def argumentIndex(values: Int*): Iterator[NodeType] = {
    val vset = values.toSet
    traversal.filter { node => vset.contains(node.argumentIndex) }
  }

  /** Traverse to nodes where the argumentIndex is not equal to the given `value`
    */
  def argumentIndexNot(value: Int): Iterator[NodeType] =
    traversal.filter { _.argumentIndex != value }

  /** Traverse to nodes where the argumentIndex is not equal to any of the given `values`
    */
  def argumentIndexNot(values: Int*): Iterator[NodeType] = {
    val vset = values.toSet
    traversal.filter { node => !vset.contains(node.argumentIndex) }
  }

  /** Traverse to nodes where the argumentIndex is greater than the given `value`
    */
  def argumentIndexGt(value: Int): Iterator[NodeType] =
    traversal.filter { _.argumentIndex > value }

  /** Traverse to nodes where the argumentIndex is greater than or equal the given `value`
    */
  def argumentIndexGte(value: Int): Iterator[NodeType] =
    traversal.filter { _.argumentIndex >= value }

  /** Traverse to nodes where the argumentIndex is less than the given `value`
    */
  def argumentIndexLt(value: Int): Iterator[NodeType] =
    traversal.filter { _.argumentIndex < value }

  /** Traverse to nodes where the argumentIndex is less than or equal the given `value`
    */
  def argumentIndexLte(value: Int): Iterator[NodeType] =
    traversal.filter { _.argumentIndex <= value }

  /** Traverse to name property */
  def name: Iterator[String] =
    traversal.map(_.name)

  /** Traverse to nodes where the name matches the regular expression `value`
    */
  def name(pattern: String): Iterator[NodeType] =
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      nameExact(pattern)
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filter { item => matcher.reset(item.name).matches }
    }

  /** Traverse to nodes where the name matches at least one of the regular expressions in `values`
    */
  def name(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.exists { _.reset(item.name).matches } }
  }

  /** Traverse to nodes where name matches `value` exactly.
    */
  def nameExact(value: String): Iterator[NodeType] = traversal match {
    case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
      val someNode = init.next
      flatgraph.Accessors
        .getWithInverseIndex(someNode.graph, someNode.nodeKind, 41, value)
        .asInstanceOf[Iterator[NodeType]]
    case _ => traversal.filter { _.name == value }
  }

  /** Traverse to nodes where name matches one of the elements in `values` exactly.
    */
  def nameExact(values: String*): Iterator[NodeType] = {
    if (values.length == 1) return nameExact(values.head)
    traversal match {
      case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
        val someNode = init.next
        values.iterator.flatMap { value =>
          flatgraph.Accessors
            .getWithInverseIndex(someNode.graph, someNode.nodeKind, 41, value)
            .asInstanceOf[Iterator[NodeType]]
        }
      case _ =>
        val valueSet = values.toSet
        traversal.filter { item => valueSet.contains(item.name) }
    }
  }

  /** Traverse to nodes where name does not match the regular expression `value`.
    */
  def nameNot(pattern: String): Iterator[NodeType] = {
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      traversal.filter { node => node.name != pattern }
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filterNot { item => matcher.reset(item.name).matches }
    }
  }

  /** Traverse to nodes where name does not match any of the regular expressions in `values`.
    */
  def nameNot(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.find { _.reset(item.name).matches }.isEmpty }
  }

  /** Traverse to parserTypeName property */
  def parserTypeName: Iterator[String] =
    traversal.map(_.parserTypeName)

  /** Traverse to nodes where the parserTypeName matches the regular expression `value`
    */
  def parserTypeName(pattern: String): Iterator[NodeType] =
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      parserTypeNameExact(pattern)
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filter { item => matcher.reset(item.parserTypeName).matches }
    }

  /** Traverse to nodes where the parserTypeName matches at least one of the regular expressions in `values`
    */
  def parserTypeName(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.exists { _.reset(item.parserTypeName).matches } }
  }

  /** Traverse to nodes where parserTypeName matches `value` exactly.
    */
  def parserTypeNameExact(value: String): Iterator[NodeType] = traversal match {
    case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
      val someNode = init.next
      flatgraph.Accessors
        .getWithInverseIndex(someNode.graph, someNode.nodeKind, 48, value)
        .asInstanceOf[Iterator[NodeType]]
    case _ => traversal.filter { _.parserTypeName == value }
  }

  /** Traverse to nodes where parserTypeName matches one of the elements in `values` exactly.
    */
  def parserTypeNameExact(values: String*): Iterator[NodeType] = {
    if (values.length == 1) return parserTypeNameExact(values.head)
    traversal match {
      case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
        val someNode = init.next
        values.iterator.flatMap { value =>
          flatgraph.Accessors
            .getWithInverseIndex(someNode.graph, someNode.nodeKind, 48, value)
            .asInstanceOf[Iterator[NodeType]]
        }
      case _ =>
        val valueSet = values.toSet
        traversal.filter { item => valueSet.contains(item.parserTypeName) }
    }
  }

  /** Traverse to nodes where parserTypeName does not match the regular expression `value`.
    */
  def parserTypeNameNot(pattern: String): Iterator[NodeType] = {
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      traversal.filter { node => node.parserTypeName != pattern }
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filterNot { item => matcher.reset(item.parserTypeName).matches }
    }
  }

  /** Traverse to nodes where parserTypeName does not match any of the regular expressions in `values`.
    */
  def parserTypeNameNot(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.find { _.reset(item.parserTypeName).matches }.isEmpty }
  }

}
