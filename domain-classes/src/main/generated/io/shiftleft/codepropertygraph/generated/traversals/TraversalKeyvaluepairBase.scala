package io.shiftleft.codepropertygraph.generated.traversals

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*

final class TraversalKeyvaluepairBase[NodeType <: nodes.KeyValuePairBase](val traversal: Iterator[NodeType])
    extends AnyVal {

  /** Traverse to key property */
  def key: Iterator[String] =
    traversal.map(_.key)

  /** Traverse to nodes where the key matches the regular expression `value`
    */
  def key(pattern: String): Iterator[NodeType] =
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      keyExact(pattern)
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filter { item => matcher.reset(item.key).matches }
    }

  /** Traverse to nodes where the key matches at least one of the regular expressions in `values`
    */
  def key(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.exists { _.reset(item.key).matches } }
  }

  /** Traverse to nodes where key matches `value` exactly.
    */
  def keyExact(value: String): Iterator[NodeType] = traversal match {
    case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
      val someNode = init.next
      flatgraph.Accessors
        .getWithInverseIndex(someNode.graph, someNode.nodeKind, 33, value)
        .asInstanceOf[Iterator[NodeType]]
    case _ => traversal.filter { _.key == value }
  }

  /** Traverse to nodes where key matches one of the elements in `values` exactly.
    */
  def keyExact(values: String*): Iterator[NodeType] = {
    if (values.length == 1) return keyExact(values.head)
    traversal match {
      case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
        val someNode = init.next
        values.iterator.flatMap { value =>
          flatgraph.Accessors
            .getWithInverseIndex(someNode.graph, someNode.nodeKind, 33, value)
            .asInstanceOf[Iterator[NodeType]]
        }
      case _ =>
        val valueSet = values.toSet
        traversal.filter { item => valueSet.contains(item.key) }
    }
  }

  /** Traverse to nodes where key does not match the regular expression `value`.
    */
  def keyNot(pattern: String): Iterator[NodeType] = {
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      traversal.filter { node => node.key != pattern }
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filterNot { item => matcher.reset(item.key).matches }
    }
  }

  /** Traverse to nodes where key does not match any of the regular expressions in `values`.
    */
  def keyNot(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.find { _.reset(item.key).matches }.isEmpty }
  }

  /** Traverse to value property */
  def value: Iterator[String] =
    traversal.map(_.value)

  /** Traverse to nodes where the value matches the regular expression `value`
    */
  def value(pattern: String): Iterator[NodeType] =
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      valueExact(pattern)
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filter { item => matcher.reset(item.value).matches }
    }

  /** Traverse to nodes where the value matches at least one of the regular expressions in `values`
    */
  def value(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.exists { _.reset(item.value).matches } }
  }

  /** Traverse to nodes where value matches `value` exactly.
    */
  def valueExact(value: String): Iterator[NodeType] = traversal match {
    case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
      val someNode = init.next
      flatgraph.Accessors
        .getWithInverseIndex(someNode.graph, someNode.nodeKind, 55, value)
        .asInstanceOf[Iterator[NodeType]]
    case _ => traversal.filter { _.value == value }
  }

  /** Traverse to nodes where value matches one of the elements in `values` exactly.
    */
  def valueExact(values: String*): Iterator[NodeType] = {
    if (values.length == 1) return valueExact(values.head)
    traversal match {
      case init: flatgraph.misc.InitNodeIterator[flatgraph.GNode @unchecked] if init.isVirgin && init.hasNext =>
        val someNode = init.next
        values.iterator.flatMap { value =>
          flatgraph.Accessors
            .getWithInverseIndex(someNode.graph, someNode.nodeKind, 55, value)
            .asInstanceOf[Iterator[NodeType]]
        }
      case _ =>
        val valueSet = values.toSet
        traversal.filter { item => valueSet.contains(item.value) }
    }
  }

  /** Traverse to nodes where value does not match the regular expression `value`.
    */
  def valueNot(pattern: String): Iterator[NodeType] = {
    if (!flatgraph.misc.Regex.isRegex(pattern)) {
      traversal.filter { node => node.value != pattern }
    } else {
      val matcher = flatgraph.misc.Regex.multilineMatcher(pattern)
      traversal.filterNot { item => matcher.reset(item.value).matches }
    }
  }

  /** Traverse to nodes where value does not match any of the regular expressions in `values`.
    */
  def valueNot(patterns: String*): Iterator[NodeType] = {
    val matchers = patterns.map(flatgraph.misc.Regex.multilineMatcher)
    traversal.filter { item => matchers.find { _.reset(item.value).matches }.isEmpty }
  }

}
