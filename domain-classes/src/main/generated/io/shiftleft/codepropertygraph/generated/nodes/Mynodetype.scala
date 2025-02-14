package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}
import scala.collection.mutable

/** Node base type for compiletime-only checks to improve type safety. EMT stands for: "erased marker trait", i.e. it is
  * erased at runtime
  */
trait MynodetypeEMT extends AnyRef with HasMypropertyEMT

trait MynodetypeBase extends AbstractNode with StaticType[MynodetypeEMT] {

  override def propertiesMap: java.util.Map[String, Any] = {
    import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*
    val res = new java.util.HashMap[String, Any]()
    if (("": String) != this.myproperty) res.put("MYPROPERTY", this.myproperty)
    res
  }
}

object Mynodetype {
  val Label = "MYNODETYPE"
  object PropertyNames {

    val Myproperty = "MYPROPERTY"
  }
  object Properties {
    val Myproperty = flatgraph.SinglePropertyKey[String](kind = 40, name = "MYPROPERTY", default = "")
  }
  object PropertyDefaults {
    val Myproperty = ""
  }
}

class Mynodetype(graph_4762: flatgraph.Graph, seq_4762: Int)
    extends StoredNode(graph_4762, 32.toShort, seq_4762)
    with MynodetypeBase
    with StaticType[MynodetypeEMT] {

  override def productElementName(n: Int): String =
    n match {
      case 0 => "myproperty"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.myproperty
      case _ => null
    }

  override def productPrefix = "Mynodetype"
  override def productArity  = 1

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[Mynodetype]
}

object NewMynodetype {
  def apply(): NewMynodetype                         = new NewMynodetype
  private val outNeighbors: Map[String, Set[String]] = Map()
  private val inNeighbors: Map[String, Set[String]]  = Map()

  object InsertionHelpers {
    object NewNodeInserter_Mynodetype_myproperty extends flatgraph.NewNodePropertyInsertionHelper {
      override def insertNewNodeProperties(
        newNodes: mutable.ArrayBuffer[flatgraph.DNode],
        dst: AnyRef,
        offsets: Array[Int]
      ): Unit = {
        if (newNodes.isEmpty) return
        val dstCast = dst.asInstanceOf[Array[String]]
        val seq     = newNodes.head.storedRef.get.seq()
        var offset  = offsets(seq)
        var idx     = 0
        while (idx < newNodes.length) {
          val nn = newNodes(idx)
          nn match {
            case generated: NewMynodetype =>
              dstCast(offset) = generated.myproperty
              offset += 1
            case _ =>
          }
          assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
          idx += 1
          offsets(idx + seq) = offset
        }
      }
    }
  }
}

class NewMynodetype extends NewNode(32.toShort) with MynodetypeBase {
  override type StoredNodeType = Mynodetype
  override def label: String = "MYNODETYPE"

  override def isValidOutNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewMynodetype.outNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }
  override def isValidInNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewMynodetype.inNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }

  var myproperty: String                   = "": String
  def myproperty(value: String): this.type = { this.myproperty = value; this }
  override def countAndVisitProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {
    interface.countProperty(this, 40, 1)
  }

  override def copy: this.type = {
    val newInstance = new NewMynodetype
    newInstance.myproperty = this.myproperty
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "myproperty"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.myproperty
      case _ => null
    }

  override def productPrefix                = "NewMynodetype"
  override def productArity                 = 1
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMynodetype]
}
