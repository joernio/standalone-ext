package io.shiftleft.codepropertygraph.generated

import flatgraph.FormalQtyType

object GraphSchema extends flatgraph.Schema {
  private val nodeLabels = IndexedSeq(
    "ANNOTATION",
    "ANNOTATION_LITERAL",
    "ANNOTATION_PARAMETER",
    "ANNOTATION_PARAMETER_ASSIGN",
    "ARRAY_INITIALIZER",
    "BINDING",
    "BLOCK",
    "CALL",
    "CLOSURE_BINDING",
    "COMMENT",
    "CONFIG_FILE",
    "CONTROL_STRUCTURE",
    "DEPENDENCY",
    "FIELD_IDENTIFIER",
    "FILE",
    "FINDING",
    "IDENTIFIER",
    "IMPORT",
    "JUMP_LABEL",
    "JUMP_TARGET",
    "KEY_VALUE_PAIR",
    "LITERAL",
    "LOCAL",
    "LOCATION",
    "MEMBER",
    "META_DATA",
    "METHOD",
    "METHOD_PARAMETER_IN",
    "METHOD_PARAMETER_OUT",
    "METHOD_REF",
    "METHOD_RETURN",
    "MODIFIER",
    "MYNODETYPE",
    "NAMESPACE",
    "NAMESPACE_BLOCK",
    "RETURN",
    "TAG",
    "TAG_NODE_PAIR",
    "TEMPLATE_DOM",
    "TYPE",
    "TYPE_ARGUMENT",
    "TYPE_DECL",
    "TYPE_PARAMETER",
    "TYPE_REF",
    "UNKNOWN"
  )
  val nodeKindByLabel = nodeLabels.zipWithIndex.toMap
  val edgeLabels: Array[String] = Array(
    "ALIAS_OF",
    "ARGUMENT",
    "AST",
    "BINDS",
    "BINDS_TO",
    "CALL",
    "CAPTURE",
    "CAPTURED_BY",
    "CDG",
    "CFG",
    "CONDITION",
    "CONTAINS",
    "DOMINATE",
    "EVAL_TYPE",
    "IMPORTS",
    "INHERITS_FROM",
    "IS_CALL_FOR_IMPORT",
    "PARAMETER_LINK",
    "POST_DOMINATE",
    "REACHING_DEF",
    "RECEIVER",
    "REF",
    "SOURCE_FILE",
    "TAGGED_BY"
  )
  val edgeKindByLabel = edgeLabels.zipWithIndex.toMap
  val edgePropertyAllocators: Array[Int => Array[?]] = Array(
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => Array.fill(size)("<empty>") /* label = REACHING_DEF, id = 19 */,
    size => null,
    size => null,
    size => null,
    size => null
  )
  val nodeFactories: Array[(flatgraph.Graph, Int) => nodes.StoredNode] = Array(
    (g, seq) => new nodes.Annotation(g, seq),
    (g, seq) => new nodes.AnnotationLiteral(g, seq),
    (g, seq) => new nodes.AnnotationParameter(g, seq),
    (g, seq) => new nodes.AnnotationParameterAssign(g, seq),
    (g, seq) => new nodes.ArrayInitializer(g, seq),
    (g, seq) => new nodes.Binding(g, seq),
    (g, seq) => new nodes.Block(g, seq),
    (g, seq) => new nodes.Call(g, seq),
    (g, seq) => new nodes.ClosureBinding(g, seq),
    (g, seq) => new nodes.Comment(g, seq),
    (g, seq) => new nodes.ConfigFile(g, seq),
    (g, seq) => new nodes.ControlStructure(g, seq),
    (g, seq) => new nodes.Dependency(g, seq),
    (g, seq) => new nodes.FieldIdentifier(g, seq),
    (g, seq) => new nodes.File(g, seq),
    (g, seq) => new nodes.Finding(g, seq),
    (g, seq) => new nodes.Identifier(g, seq),
    (g, seq) => new nodes.Import(g, seq),
    (g, seq) => new nodes.JumpLabel(g, seq),
    (g, seq) => new nodes.JumpTarget(g, seq),
    (g, seq) => new nodes.KeyValuePair(g, seq),
    (g, seq) => new nodes.Literal(g, seq),
    (g, seq) => new nodes.Local(g, seq),
    (g, seq) => new nodes.Location(g, seq),
    (g, seq) => new nodes.Member(g, seq),
    (g, seq) => new nodes.MetaData(g, seq),
    (g, seq) => new nodes.Method(g, seq),
    (g, seq) => new nodes.MethodParameterIn(g, seq),
    (g, seq) => new nodes.MethodParameterOut(g, seq),
    (g, seq) => new nodes.MethodRef(g, seq),
    (g, seq) => new nodes.MethodReturn(g, seq),
    (g, seq) => new nodes.Modifier(g, seq),
    (g, seq) => new nodes.Mynodetype(g, seq),
    (g, seq) => new nodes.Namespace(g, seq),
    (g, seq) => new nodes.NamespaceBlock(g, seq),
    (g, seq) => new nodes.Return(g, seq),
    (g, seq) => new nodes.Tag(g, seq),
    (g, seq) => new nodes.TagNodePair(g, seq),
    (g, seq) => new nodes.TemplateDom(g, seq),
    (g, seq) => new nodes.Type(g, seq),
    (g, seq) => new nodes.TypeArgument(g, seq),
    (g, seq) => new nodes.TypeDecl(g, seq),
    (g, seq) => new nodes.TypeParameter(g, seq),
    (g, seq) => new nodes.TypeRef(g, seq),
    (g, seq) => new nodes.Unknown(g, seq)
  )
  val edgeFactories: Array[(flatgraph.GNode, flatgraph.GNode, Int, Any) => flatgraph.Edge] = Array(
    (s, d, subseq, p) => new edges.AliasOf(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Argument(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ast(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Binds(s, d, subseq, p),
    (s, d, subseq, p) => new edges.BindsTo(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Call(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Capture(s, d, subseq, p),
    (s, d, subseq, p) => new edges.CapturedBy(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cdg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cfg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Condition(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Contains(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Dominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.EvalType(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Imports(s, d, subseq, p),
    (s, d, subseq, p) => new edges.InheritsFrom(s, d, subseq, p),
    (s, d, subseq, p) => new edges.IsCallForImport(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ParameterLink(s, d, subseq, p),
    (s, d, subseq, p) => new edges.PostDominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ReachingDef(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Receiver(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ref(s, d, subseq, p),
    (s, d, subseq, p) => new edges.SourceFile(s, d, subseq, p),
    (s, d, subseq, p) => new edges.TaggedBy(s, d, subseq, p)
  )
  val nodePropertyAllocators: Array[Int => Array[?]] = Array(
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size)
  )
  val normalNodePropertyNames: Array[String] = Array(
    "ALIAS_TYPE_FULL_NAME",
    "ARGUMENT_INDEX",
    "ARGUMENT_NAME",
    "AST_PARENT_FULL_NAME",
    "AST_PARENT_TYPE",
    "CANONICAL_NAME",
    "CLASS_NAME",
    "CLASS_SHORT_NAME",
    "CLOSURE_BINDING_ID",
    "CLOSURE_ORIGINAL_NAME",
    "CODE",
    "COLUMN_NUMBER",
    "COLUMN_NUMBER_END",
    "CONTAINED_REF",
    "CONTENT",
    "CONTROL_STRUCTURE_TYPE",
    "DEPENDENCY_GROUP_ID",
    "DISPATCH_TYPE",
    "DYNAMIC_TYPE_HINT_FULL_NAME",
    "EVALUATION_STRATEGY",
    "EXPLICIT_AS",
    "FILENAME",
    "FULL_NAME",
    "GENERIC_SIGNATURE",
    "HASH",
    "IMPORTED_AS",
    "IMPORTED_ENTITY",
    "INDEX",
    "INHERITS_FROM_TYPE_FULL_NAME",
    "IS_EXPLICIT",
    "IS_EXTERNAL",
    "IS_VARIADIC",
    "IS_WILDCARD",
    "KEY",
    "LANGUAGE",
    "LINE_NUMBER",
    "LINE_NUMBER_END",
    "METHOD_FULL_NAME",
    "METHOD_SHORT_NAME",
    "MODIFIER_TYPE",
    "MYPROPERTY",
    "NAME",
    "NODE_LABEL",
    "OFFSET",
    "OFFSET_END",
    "ORDER",
    "OVERLAYS",
    "PACKAGE_NAME",
    "PARSER_TYPE_NAME",
    "POSSIBLE_TYPES",
    "ROOT",
    "SIGNATURE",
    "SYMBOL",
    "TYPE_DECL_FULL_NAME",
    "TYPE_FULL_NAME",
    "VALUE",
    "VERSION"
  )
  val nodePropertyByLabel = normalNodePropertyNames.zipWithIndex.toMap
    .updated("evidence", 57)
    .updated("keyValuePairs", 58)
    .updated("node", 59)
    .updated("tag", 60)
  val nodePropertyDescriptors: Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType] = {
    val nodePropertyDescriptors = new Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType](5490)
    for (idx <- Range(0, 5490)) {
      nodePropertyDescriptors(idx) =
        if ((idx & 1) == 0) FormalQtyType.NothingType
        else FormalQtyType.QtyNone
    }

    nodePropertyDescriptors(90) = FormalQtyType.IntType // ANNOTATION.ARGUMENT_INDEX
    nodePropertyDescriptors(91) = FormalQtyType.QtyOne
    nodePropertyDescriptors(180) = FormalQtyType.StringType // ANNOTATION.ARGUMENT_NAME
    nodePropertyDescriptors(181) = FormalQtyType.QtyOption
    nodePropertyDescriptors(900) = FormalQtyType.StringType // ANNOTATION.CODE
    nodePropertyDescriptors(901) = FormalQtyType.QtyOne
    nodePropertyDescriptors(990) = FormalQtyType.IntType // ANNOTATION.COLUMN_NUMBER
    nodePropertyDescriptors(991) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1980) = FormalQtyType.StringType // ANNOTATION.FULL_NAME
    nodePropertyDescriptors(1981) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3150) = FormalQtyType.IntType // ANNOTATION.LINE_NUMBER
    nodePropertyDescriptors(3151) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3690) = FormalQtyType.StringType // ANNOTATION.NAME
    nodePropertyDescriptors(3691) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4050) = FormalQtyType.IntType // ANNOTATION.ORDER
    nodePropertyDescriptors(4051) = FormalQtyType.QtyOne
    nodePropertyDescriptors(92) = FormalQtyType.IntType // ANNOTATION_LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(93) = FormalQtyType.QtyOne
    nodePropertyDescriptors(182) = FormalQtyType.StringType // ANNOTATION_LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(183) = FormalQtyType.QtyOption
    nodePropertyDescriptors(902) = FormalQtyType.StringType // ANNOTATION_LITERAL.CODE
    nodePropertyDescriptors(903) = FormalQtyType.QtyOne
    nodePropertyDescriptors(992) = FormalQtyType.IntType // ANNOTATION_LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(993) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3152) = FormalQtyType.IntType // ANNOTATION_LITERAL.LINE_NUMBER
    nodePropertyDescriptors(3153) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3692) = FormalQtyType.StringType // ANNOTATION_LITERAL.NAME
    nodePropertyDescriptors(3693) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4052) = FormalQtyType.IntType // ANNOTATION_LITERAL.ORDER
    nodePropertyDescriptors(4053) = FormalQtyType.QtyOne
    nodePropertyDescriptors(904) = FormalQtyType.StringType // ANNOTATION_PARAMETER.CODE
    nodePropertyDescriptors(905) = FormalQtyType.QtyOne
    nodePropertyDescriptors(994) = FormalQtyType.IntType // ANNOTATION_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(995) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3154) = FormalQtyType.IntType // ANNOTATION_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(3155) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4054) = FormalQtyType.IntType // ANNOTATION_PARAMETER.ORDER
    nodePropertyDescriptors(4055) = FormalQtyType.QtyOne
    nodePropertyDescriptors(906) = FormalQtyType.StringType // ANNOTATION_PARAMETER_ASSIGN.CODE
    nodePropertyDescriptors(907) = FormalQtyType.QtyOne
    nodePropertyDescriptors(996) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.COLUMN_NUMBER
    nodePropertyDescriptors(997) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3156) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.LINE_NUMBER
    nodePropertyDescriptors(3157) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4056) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.ORDER
    nodePropertyDescriptors(4057) = FormalQtyType.QtyOne
    nodePropertyDescriptors(98) = FormalQtyType.IntType // ARRAY_INITIALIZER.ARGUMENT_INDEX
    nodePropertyDescriptors(99) = FormalQtyType.QtyOne
    nodePropertyDescriptors(188) = FormalQtyType.StringType // ARRAY_INITIALIZER.ARGUMENT_NAME
    nodePropertyDescriptors(189) = FormalQtyType.QtyOption
    nodePropertyDescriptors(908) = FormalQtyType.StringType // ARRAY_INITIALIZER.CODE
    nodePropertyDescriptors(909) = FormalQtyType.QtyOne
    nodePropertyDescriptors(998) = FormalQtyType.IntType // ARRAY_INITIALIZER.COLUMN_NUMBER
    nodePropertyDescriptors(999) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3158) = FormalQtyType.IntType // ARRAY_INITIALIZER.LINE_NUMBER
    nodePropertyDescriptors(3159) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4058) = FormalQtyType.IntType // ARRAY_INITIALIZER.ORDER
    nodePropertyDescriptors(4059) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3340) = FormalQtyType.StringType // BINDING.METHOD_FULL_NAME
    nodePropertyDescriptors(3341) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3700) = FormalQtyType.StringType // BINDING.NAME
    nodePropertyDescriptors(3701) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4600) = FormalQtyType.StringType // BINDING.SIGNATURE
    nodePropertyDescriptors(4601) = FormalQtyType.QtyOne
    nodePropertyDescriptors(102) = FormalQtyType.IntType // BLOCK.ARGUMENT_INDEX
    nodePropertyDescriptors(103) = FormalQtyType.QtyOne
    nodePropertyDescriptors(192) = FormalQtyType.StringType // BLOCK.ARGUMENT_NAME
    nodePropertyDescriptors(193) = FormalQtyType.QtyOption
    nodePropertyDescriptors(912) = FormalQtyType.StringType // BLOCK.CODE
    nodePropertyDescriptors(913) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1002) = FormalQtyType.IntType // BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(1003) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1632) = FormalQtyType.StringType // BLOCK.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1633) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3162) = FormalQtyType.IntType // BLOCK.LINE_NUMBER
    nodePropertyDescriptors(3163) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4062) = FormalQtyType.IntType // BLOCK.ORDER
    nodePropertyDescriptors(4063) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4422) = FormalQtyType.StringType // BLOCK.POSSIBLE_TYPES
    nodePropertyDescriptors(4423) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4872) = FormalQtyType.StringType // BLOCK.TYPE_FULL_NAME
    nodePropertyDescriptors(4873) = FormalQtyType.QtyOne
    nodePropertyDescriptors(104) = FormalQtyType.IntType // CALL.ARGUMENT_INDEX
    nodePropertyDescriptors(105) = FormalQtyType.QtyOne
    nodePropertyDescriptors(194) = FormalQtyType.StringType // CALL.ARGUMENT_NAME
    nodePropertyDescriptors(195) = FormalQtyType.QtyOption
    nodePropertyDescriptors(914) = FormalQtyType.StringType // CALL.CODE
    nodePropertyDescriptors(915) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1004) = FormalQtyType.IntType // CALL.COLUMN_NUMBER
    nodePropertyDescriptors(1005) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1544) = FormalQtyType.StringType // CALL.DISPATCH_TYPE
    nodePropertyDescriptors(1545) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1634) = FormalQtyType.StringType // CALL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1635) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3164) = FormalQtyType.IntType // CALL.LINE_NUMBER
    nodePropertyDescriptors(3165) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3344) = FormalQtyType.StringType // CALL.METHOD_FULL_NAME
    nodePropertyDescriptors(3345) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3704) = FormalQtyType.StringType // CALL.NAME
    nodePropertyDescriptors(3705) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4064) = FormalQtyType.IntType // CALL.ORDER
    nodePropertyDescriptors(4065) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4424) = FormalQtyType.StringType // CALL.POSSIBLE_TYPES
    nodePropertyDescriptors(4425) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4604) = FormalQtyType.StringType // CALL.SIGNATURE
    nodePropertyDescriptors(4605) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4874) = FormalQtyType.StringType // CALL.TYPE_FULL_NAME
    nodePropertyDescriptors(4875) = FormalQtyType.QtyOne
    nodePropertyDescriptors(736) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_BINDING_ID
    nodePropertyDescriptors(737) = FormalQtyType.QtyOption
    nodePropertyDescriptors(826) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_ORIGINAL_NAME
    nodePropertyDescriptors(827) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1726) = FormalQtyType.StringType // CLOSURE_BINDING.EVALUATION_STRATEGY
    nodePropertyDescriptors(1727) = FormalQtyType.QtyOne
    nodePropertyDescriptors(918) = FormalQtyType.StringType // COMMENT.CODE
    nodePropertyDescriptors(919) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1008) = FormalQtyType.IntType // COMMENT.COLUMN_NUMBER
    nodePropertyDescriptors(1009) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1908) = FormalQtyType.StringType // COMMENT.FILENAME
    nodePropertyDescriptors(1909) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3168) = FormalQtyType.IntType // COMMENT.LINE_NUMBER
    nodePropertyDescriptors(3169) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4068) = FormalQtyType.IntType // COMMENT.ORDER
    nodePropertyDescriptors(4069) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1280) = FormalQtyType.StringType // CONFIG_FILE.CONTENT
    nodePropertyDescriptors(1281) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3710) = FormalQtyType.StringType // CONFIG_FILE.NAME
    nodePropertyDescriptors(3711) = FormalQtyType.QtyOne
    nodePropertyDescriptors(112) = FormalQtyType.IntType // CONTROL_STRUCTURE.ARGUMENT_INDEX
    nodePropertyDescriptors(113) = FormalQtyType.QtyOne
    nodePropertyDescriptors(202) = FormalQtyType.StringType // CONTROL_STRUCTURE.ARGUMENT_NAME
    nodePropertyDescriptors(203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(922) = FormalQtyType.StringType // CONTROL_STRUCTURE.CODE
    nodePropertyDescriptors(923) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1012) = FormalQtyType.IntType // CONTROL_STRUCTURE.COLUMN_NUMBER
    nodePropertyDescriptors(1013) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1372) = FormalQtyType.StringType // CONTROL_STRUCTURE.CONTROL_STRUCTURE_TYPE
    nodePropertyDescriptors(1373) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3172) = FormalQtyType.IntType // CONTROL_STRUCTURE.LINE_NUMBER
    nodePropertyDescriptors(3173) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4072) = FormalQtyType.IntType // CONTROL_STRUCTURE.ORDER
    nodePropertyDescriptors(4073) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4342) = FormalQtyType.StringType // CONTROL_STRUCTURE.PARSER_TYPE_NAME
    nodePropertyDescriptors(4343) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1464) = FormalQtyType.StringType // DEPENDENCY.DEPENDENCY_GROUP_ID
    nodePropertyDescriptors(1465) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3714) = FormalQtyType.StringType // DEPENDENCY.NAME
    nodePropertyDescriptors(3715) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5064) = FormalQtyType.StringType // DEPENDENCY.VERSION
    nodePropertyDescriptors(5065) = FormalQtyType.QtyOne
    nodePropertyDescriptors(116) = FormalQtyType.IntType // FIELD_IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(117) = FormalQtyType.QtyOne
    nodePropertyDescriptors(206) = FormalQtyType.StringType // FIELD_IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(207) = FormalQtyType.QtyOption
    nodePropertyDescriptors(476) = FormalQtyType.StringType // FIELD_IDENTIFIER.CANONICAL_NAME
    nodePropertyDescriptors(477) = FormalQtyType.QtyOne
    nodePropertyDescriptors(926) = FormalQtyType.StringType // FIELD_IDENTIFIER.CODE
    nodePropertyDescriptors(927) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1016) = FormalQtyType.IntType // FIELD_IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1017) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3176) = FormalQtyType.IntType // FIELD_IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(3177) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4076) = FormalQtyType.IntType // FIELD_IDENTIFIER.ORDER
    nodePropertyDescriptors(4077) = FormalQtyType.QtyOne
    nodePropertyDescriptors(928) = FormalQtyType.StringType // FILE.CODE
    nodePropertyDescriptors(929) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1018) = FormalQtyType.IntType // FILE.COLUMN_NUMBER
    nodePropertyDescriptors(1019) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1288) = FormalQtyType.StringType // FILE.CONTENT
    nodePropertyDescriptors(1289) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2188) = FormalQtyType.StringType // FILE.HASH
    nodePropertyDescriptors(2189) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3178) = FormalQtyType.IntType // FILE.LINE_NUMBER
    nodePropertyDescriptors(3179) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3718) = FormalQtyType.StringType // FILE.NAME
    nodePropertyDescriptors(3719) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4078) = FormalQtyType.IntType // FILE.ORDER
    nodePropertyDescriptors(4079) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5160) = FormalQtyType.RefType // FINDING.evidence
    nodePropertyDescriptors(5161) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(5250) = FormalQtyType.RefType // FINDING.keyValuePairs
    nodePropertyDescriptors(5251) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(122) = FormalQtyType.IntType // IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(123) = FormalQtyType.QtyOne
    nodePropertyDescriptors(212) = FormalQtyType.StringType // IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(213) = FormalQtyType.QtyOption
    nodePropertyDescriptors(932) = FormalQtyType.StringType // IDENTIFIER.CODE
    nodePropertyDescriptors(933) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1022) = FormalQtyType.IntType // IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1023) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1652) = FormalQtyType.StringType // IDENTIFIER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1653) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3182) = FormalQtyType.IntType // IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(3183) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3722) = FormalQtyType.StringType // IDENTIFIER.NAME
    nodePropertyDescriptors(3723) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4082) = FormalQtyType.IntType // IDENTIFIER.ORDER
    nodePropertyDescriptors(4083) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4442) = FormalQtyType.StringType // IDENTIFIER.POSSIBLE_TYPES
    nodePropertyDescriptors(4443) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4892) = FormalQtyType.StringType // IDENTIFIER.TYPE_FULL_NAME
    nodePropertyDescriptors(4893) = FormalQtyType.QtyOne
    nodePropertyDescriptors(934) = FormalQtyType.StringType // IMPORT.CODE
    nodePropertyDescriptors(935) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1024) = FormalQtyType.IntType // IMPORT.COLUMN_NUMBER
    nodePropertyDescriptors(1025) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1834) = FormalQtyType.BoolType // IMPORT.EXPLICIT_AS
    nodePropertyDescriptors(1835) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2284) = FormalQtyType.StringType // IMPORT.IMPORTED_AS
    nodePropertyDescriptors(2285) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2374) = FormalQtyType.StringType // IMPORT.IMPORTED_ENTITY
    nodePropertyDescriptors(2375) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2644) = FormalQtyType.BoolType // IMPORT.IS_EXPLICIT
    nodePropertyDescriptors(2645) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2914) = FormalQtyType.BoolType // IMPORT.IS_WILDCARD
    nodePropertyDescriptors(2915) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3184) = FormalQtyType.IntType // IMPORT.LINE_NUMBER
    nodePropertyDescriptors(3185) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4084) = FormalQtyType.IntType // IMPORT.ORDER
    nodePropertyDescriptors(4085) = FormalQtyType.QtyOne
    nodePropertyDescriptors(936) = FormalQtyType.StringType // JUMP_LABEL.CODE
    nodePropertyDescriptors(937) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1026) = FormalQtyType.IntType // JUMP_LABEL.COLUMN_NUMBER
    nodePropertyDescriptors(1027) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3186) = FormalQtyType.IntType // JUMP_LABEL.LINE_NUMBER
    nodePropertyDescriptors(3187) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3726) = FormalQtyType.StringType // JUMP_LABEL.NAME
    nodePropertyDescriptors(3727) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4086) = FormalQtyType.IntType // JUMP_LABEL.ORDER
    nodePropertyDescriptors(4087) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4356) = FormalQtyType.StringType // JUMP_LABEL.PARSER_TYPE_NAME
    nodePropertyDescriptors(4357) = FormalQtyType.QtyOne
    nodePropertyDescriptors(128) = FormalQtyType.IntType // JUMP_TARGET.ARGUMENT_INDEX
    nodePropertyDescriptors(129) = FormalQtyType.QtyOne
    nodePropertyDescriptors(938) = FormalQtyType.StringType // JUMP_TARGET.CODE
    nodePropertyDescriptors(939) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1028) = FormalQtyType.IntType // JUMP_TARGET.COLUMN_NUMBER
    nodePropertyDescriptors(1029) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3188) = FormalQtyType.IntType // JUMP_TARGET.LINE_NUMBER
    nodePropertyDescriptors(3189) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3728) = FormalQtyType.StringType // JUMP_TARGET.NAME
    nodePropertyDescriptors(3729) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4088) = FormalQtyType.IntType // JUMP_TARGET.ORDER
    nodePropertyDescriptors(4089) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4358) = FormalQtyType.StringType // JUMP_TARGET.PARSER_TYPE_NAME
    nodePropertyDescriptors(4359) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3010) = FormalQtyType.StringType // KEY_VALUE_PAIR.KEY
    nodePropertyDescriptors(3011) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4990) = FormalQtyType.StringType // KEY_VALUE_PAIR.VALUE
    nodePropertyDescriptors(4991) = FormalQtyType.QtyOne
    nodePropertyDescriptors(132) = FormalQtyType.IntType // LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(133) = FormalQtyType.QtyOne
    nodePropertyDescriptors(222) = FormalQtyType.StringType // LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(223) = FormalQtyType.QtyOption
    nodePropertyDescriptors(942) = FormalQtyType.StringType // LITERAL.CODE
    nodePropertyDescriptors(943) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1032) = FormalQtyType.IntType // LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(1033) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1662) = FormalQtyType.StringType // LITERAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1663) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3192) = FormalQtyType.IntType // LITERAL.LINE_NUMBER
    nodePropertyDescriptors(3193) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4092) = FormalQtyType.IntType // LITERAL.ORDER
    nodePropertyDescriptors(4093) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4452) = FormalQtyType.StringType // LITERAL.POSSIBLE_TYPES
    nodePropertyDescriptors(4453) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4902) = FormalQtyType.StringType // LITERAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4903) = FormalQtyType.QtyOne
    nodePropertyDescriptors(764) = FormalQtyType.StringType // LOCAL.CLOSURE_BINDING_ID
    nodePropertyDescriptors(765) = FormalQtyType.QtyOption
    nodePropertyDescriptors(944) = FormalQtyType.StringType // LOCAL.CODE
    nodePropertyDescriptors(945) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1034) = FormalQtyType.IntType // LOCAL.COLUMN_NUMBER
    nodePropertyDescriptors(1035) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1664) = FormalQtyType.StringType // LOCAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1665) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2114) = FormalQtyType.StringType // LOCAL.GENERIC_SIGNATURE
    nodePropertyDescriptors(2115) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3194) = FormalQtyType.IntType // LOCAL.LINE_NUMBER
    nodePropertyDescriptors(3195) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3734) = FormalQtyType.StringType // LOCAL.NAME
    nodePropertyDescriptors(3735) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4094) = FormalQtyType.IntType // LOCAL.ORDER
    nodePropertyDescriptors(4095) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4454) = FormalQtyType.StringType // LOCAL.POSSIBLE_TYPES
    nodePropertyDescriptors(4455) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4904) = FormalQtyType.StringType // LOCAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4905) = FormalQtyType.QtyOne
    nodePropertyDescriptors(586) = FormalQtyType.StringType // LOCATION.CLASS_NAME
    nodePropertyDescriptors(587) = FormalQtyType.QtyOne
    nodePropertyDescriptors(676) = FormalQtyType.StringType // LOCATION.CLASS_SHORT_NAME
    nodePropertyDescriptors(677) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1936) = FormalQtyType.StringType // LOCATION.FILENAME
    nodePropertyDescriptors(1937) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3196) = FormalQtyType.IntType // LOCATION.LINE_NUMBER
    nodePropertyDescriptors(3197) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3376) = FormalQtyType.StringType // LOCATION.METHOD_FULL_NAME
    nodePropertyDescriptors(3377) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3466) = FormalQtyType.StringType // LOCATION.METHOD_SHORT_NAME
    nodePropertyDescriptors(3467) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3826) = FormalQtyType.StringType // LOCATION.NODE_LABEL
    nodePropertyDescriptors(3827) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4276) = FormalQtyType.StringType // LOCATION.PACKAGE_NAME
    nodePropertyDescriptors(4277) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4726) = FormalQtyType.StringType // LOCATION.SYMBOL
    nodePropertyDescriptors(4727) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5356) = FormalQtyType.RefType // LOCATION.node
    nodePropertyDescriptors(5357) = FormalQtyType.QtyOption
    nodePropertyDescriptors(318) = FormalQtyType.StringType // MEMBER.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(319) = FormalQtyType.QtyOne
    nodePropertyDescriptors(408) = FormalQtyType.StringType // MEMBER.AST_PARENT_TYPE
    nodePropertyDescriptors(409) = FormalQtyType.QtyOne
    nodePropertyDescriptors(948) = FormalQtyType.StringType // MEMBER.CODE
    nodePropertyDescriptors(949) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1038) = FormalQtyType.IntType // MEMBER.COLUMN_NUMBER
    nodePropertyDescriptors(1039) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1668) = FormalQtyType.StringType // MEMBER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1669) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2118) = FormalQtyType.StringType // MEMBER.GENERIC_SIGNATURE
    nodePropertyDescriptors(2119) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3198) = FormalQtyType.IntType // MEMBER.LINE_NUMBER
    nodePropertyDescriptors(3199) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3738) = FormalQtyType.StringType // MEMBER.NAME
    nodePropertyDescriptors(3739) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4098) = FormalQtyType.IntType // MEMBER.ORDER
    nodePropertyDescriptors(4099) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4458) = FormalQtyType.StringType // MEMBER.POSSIBLE_TYPES
    nodePropertyDescriptors(4459) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4908) = FormalQtyType.StringType // MEMBER.TYPE_FULL_NAME
    nodePropertyDescriptors(4909) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2210) = FormalQtyType.StringType // META_DATA.HASH
    nodePropertyDescriptors(2211) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3110) = FormalQtyType.StringType // META_DATA.LANGUAGE
    nodePropertyDescriptors(3111) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4190) = FormalQtyType.StringType // META_DATA.OVERLAYS
    nodePropertyDescriptors(4191) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4550) = FormalQtyType.StringType // META_DATA.ROOT
    nodePropertyDescriptors(4551) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5090) = FormalQtyType.StringType // META_DATA.VERSION
    nodePropertyDescriptors(5091) = FormalQtyType.QtyOne
    nodePropertyDescriptors(322) = FormalQtyType.StringType // METHOD.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(323) = FormalQtyType.QtyOne
    nodePropertyDescriptors(412) = FormalQtyType.StringType // METHOD.AST_PARENT_TYPE
    nodePropertyDescriptors(413) = FormalQtyType.QtyOne
    nodePropertyDescriptors(952) = FormalQtyType.StringType // METHOD.CODE
    nodePropertyDescriptors(953) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1042) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER
    nodePropertyDescriptors(1043) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1132) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER_END
    nodePropertyDescriptors(1133) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1942) = FormalQtyType.StringType // METHOD.FILENAME
    nodePropertyDescriptors(1943) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2032) = FormalQtyType.StringType // METHOD.FULL_NAME
    nodePropertyDescriptors(2033) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2122) = FormalQtyType.StringType // METHOD.GENERIC_SIGNATURE
    nodePropertyDescriptors(2123) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2212) = FormalQtyType.StringType // METHOD.HASH
    nodePropertyDescriptors(2213) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2752) = FormalQtyType.BoolType // METHOD.IS_EXTERNAL
    nodePropertyDescriptors(2753) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3202) = FormalQtyType.IntType // METHOD.LINE_NUMBER
    nodePropertyDescriptors(3203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3292) = FormalQtyType.IntType // METHOD.LINE_NUMBER_END
    nodePropertyDescriptors(3293) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3742) = FormalQtyType.StringType // METHOD.NAME
    nodePropertyDescriptors(3743) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3922) = FormalQtyType.IntType // METHOD.OFFSET
    nodePropertyDescriptors(3923) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4012) = FormalQtyType.IntType // METHOD.OFFSET_END
    nodePropertyDescriptors(4013) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4102) = FormalQtyType.IntType // METHOD.ORDER
    nodePropertyDescriptors(4103) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4642) = FormalQtyType.StringType // METHOD.SIGNATURE
    nodePropertyDescriptors(4643) = FormalQtyType.QtyOne
    nodePropertyDescriptors(774) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CLOSURE_BINDING_ID
    nodePropertyDescriptors(775) = FormalQtyType.QtyOption
    nodePropertyDescriptors(954) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CODE
    nodePropertyDescriptors(955) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1044) = FormalQtyType.IntType // METHOD_PARAMETER_IN.COLUMN_NUMBER
    nodePropertyDescriptors(1045) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1674) = FormalQtyType.StringType // METHOD_PARAMETER_IN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1675) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1764) = FormalQtyType.StringType // METHOD_PARAMETER_IN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1765) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2484) = FormalQtyType.IntType // METHOD_PARAMETER_IN.INDEX
    nodePropertyDescriptors(2485) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2844) = FormalQtyType.BoolType // METHOD_PARAMETER_IN.IS_VARIADIC
    nodePropertyDescriptors(2845) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3204) = FormalQtyType.IntType // METHOD_PARAMETER_IN.LINE_NUMBER
    nodePropertyDescriptors(3205) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3744) = FormalQtyType.StringType // METHOD_PARAMETER_IN.NAME
    nodePropertyDescriptors(3745) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4104) = FormalQtyType.IntType // METHOD_PARAMETER_IN.ORDER
    nodePropertyDescriptors(4105) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4464) = FormalQtyType.StringType // METHOD_PARAMETER_IN.POSSIBLE_TYPES
    nodePropertyDescriptors(4465) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4914) = FormalQtyType.StringType // METHOD_PARAMETER_IN.TYPE_FULL_NAME
    nodePropertyDescriptors(4915) = FormalQtyType.QtyOne
    nodePropertyDescriptors(956) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.CODE
    nodePropertyDescriptors(957) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1046) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.COLUMN_NUMBER
    nodePropertyDescriptors(1047) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1766) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.EVALUATION_STRATEGY
    nodePropertyDescriptors(1767) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2486) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.INDEX
    nodePropertyDescriptors(2487) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2846) = FormalQtyType.BoolType // METHOD_PARAMETER_OUT.IS_VARIADIC
    nodePropertyDescriptors(2847) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3206) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.LINE_NUMBER
    nodePropertyDescriptors(3207) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3746) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.NAME
    nodePropertyDescriptors(3747) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4106) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.ORDER
    nodePropertyDescriptors(4107) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4916) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.TYPE_FULL_NAME
    nodePropertyDescriptors(4917) = FormalQtyType.QtyOne
    nodePropertyDescriptors(148) = FormalQtyType.IntType // METHOD_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(149) = FormalQtyType.QtyOne
    nodePropertyDescriptors(238) = FormalQtyType.StringType // METHOD_REF.ARGUMENT_NAME
    nodePropertyDescriptors(239) = FormalQtyType.QtyOption
    nodePropertyDescriptors(958) = FormalQtyType.StringType // METHOD_REF.CODE
    nodePropertyDescriptors(959) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1048) = FormalQtyType.IntType // METHOD_REF.COLUMN_NUMBER
    nodePropertyDescriptors(1049) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1678) = FormalQtyType.StringType // METHOD_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1679) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3208) = FormalQtyType.IntType // METHOD_REF.LINE_NUMBER
    nodePropertyDescriptors(3209) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3388) = FormalQtyType.StringType // METHOD_REF.METHOD_FULL_NAME
    nodePropertyDescriptors(3389) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4108) = FormalQtyType.IntType // METHOD_REF.ORDER
    nodePropertyDescriptors(4109) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4468) = FormalQtyType.StringType // METHOD_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(4469) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4918) = FormalQtyType.StringType // METHOD_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4919) = FormalQtyType.QtyOne
    nodePropertyDescriptors(960) = FormalQtyType.StringType // METHOD_RETURN.CODE
    nodePropertyDescriptors(961) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1050) = FormalQtyType.IntType // METHOD_RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(1051) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1680) = FormalQtyType.StringType // METHOD_RETURN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1681) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1770) = FormalQtyType.StringType // METHOD_RETURN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1771) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3210) = FormalQtyType.IntType // METHOD_RETURN.LINE_NUMBER
    nodePropertyDescriptors(3211) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4110) = FormalQtyType.IntType // METHOD_RETURN.ORDER
    nodePropertyDescriptors(4111) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4470) = FormalQtyType.StringType // METHOD_RETURN.POSSIBLE_TYPES
    nodePropertyDescriptors(4471) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4920) = FormalQtyType.StringType // METHOD_RETURN.TYPE_FULL_NAME
    nodePropertyDescriptors(4921) = FormalQtyType.QtyOne
    nodePropertyDescriptors(962) = FormalQtyType.StringType // MODIFIER.CODE
    nodePropertyDescriptors(963) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1052) = FormalQtyType.IntType // MODIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1053) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3212) = FormalQtyType.IntType // MODIFIER.LINE_NUMBER
    nodePropertyDescriptors(3213) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3572) = FormalQtyType.StringType // MODIFIER.MODIFIER_TYPE
    nodePropertyDescriptors(3573) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4112) = FormalQtyType.IntType // MODIFIER.ORDER
    nodePropertyDescriptors(4113) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3664) = FormalQtyType.StringType // MYNODETYPE.MYPROPERTY
    nodePropertyDescriptors(3665) = FormalQtyType.QtyOne
    nodePropertyDescriptors(966) = FormalQtyType.StringType // NAMESPACE.CODE
    nodePropertyDescriptors(967) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1056) = FormalQtyType.IntType // NAMESPACE.COLUMN_NUMBER
    nodePropertyDescriptors(1057) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3216) = FormalQtyType.IntType // NAMESPACE.LINE_NUMBER
    nodePropertyDescriptors(3217) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3756) = FormalQtyType.StringType // NAMESPACE.NAME
    nodePropertyDescriptors(3757) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4116) = FormalQtyType.IntType // NAMESPACE.ORDER
    nodePropertyDescriptors(4117) = FormalQtyType.QtyOne
    nodePropertyDescriptors(968) = FormalQtyType.StringType // NAMESPACE_BLOCK.CODE
    nodePropertyDescriptors(969) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1058) = FormalQtyType.IntType // NAMESPACE_BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(1059) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1958) = FormalQtyType.StringType // NAMESPACE_BLOCK.FILENAME
    nodePropertyDescriptors(1959) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2048) = FormalQtyType.StringType // NAMESPACE_BLOCK.FULL_NAME
    nodePropertyDescriptors(2049) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3218) = FormalQtyType.IntType // NAMESPACE_BLOCK.LINE_NUMBER
    nodePropertyDescriptors(3219) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3758) = FormalQtyType.StringType // NAMESPACE_BLOCK.NAME
    nodePropertyDescriptors(3759) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4118) = FormalQtyType.IntType // NAMESPACE_BLOCK.ORDER
    nodePropertyDescriptors(4119) = FormalQtyType.QtyOne
    nodePropertyDescriptors(160) = FormalQtyType.IntType // RETURN.ARGUMENT_INDEX
    nodePropertyDescriptors(161) = FormalQtyType.QtyOne
    nodePropertyDescriptors(250) = FormalQtyType.StringType // RETURN.ARGUMENT_NAME
    nodePropertyDescriptors(251) = FormalQtyType.QtyOption
    nodePropertyDescriptors(970) = FormalQtyType.StringType // RETURN.CODE
    nodePropertyDescriptors(971) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1060) = FormalQtyType.IntType // RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(1061) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3220) = FormalQtyType.IntType // RETURN.LINE_NUMBER
    nodePropertyDescriptors(3221) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4120) = FormalQtyType.IntType // RETURN.ORDER
    nodePropertyDescriptors(4121) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3762) = FormalQtyType.StringType // TAG.NAME
    nodePropertyDescriptors(3763) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5022) = FormalQtyType.StringType // TAG.VALUE
    nodePropertyDescriptors(5023) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5384) = FormalQtyType.RefType // TAG_NODE_PAIR.node
    nodePropertyDescriptors(5385) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5474) = FormalQtyType.RefType // TAG_NODE_PAIR.tag
    nodePropertyDescriptors(5475) = FormalQtyType.QtyOne
    nodePropertyDescriptors(166) = FormalQtyType.IntType // TEMPLATE_DOM.ARGUMENT_INDEX
    nodePropertyDescriptors(167) = FormalQtyType.QtyOne
    nodePropertyDescriptors(256) = FormalQtyType.StringType // TEMPLATE_DOM.ARGUMENT_NAME
    nodePropertyDescriptors(257) = FormalQtyType.QtyOption
    nodePropertyDescriptors(976) = FormalQtyType.StringType // TEMPLATE_DOM.CODE
    nodePropertyDescriptors(977) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1066) = FormalQtyType.IntType // TEMPLATE_DOM.COLUMN_NUMBER
    nodePropertyDescriptors(1067) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3226) = FormalQtyType.IntType // TEMPLATE_DOM.LINE_NUMBER
    nodePropertyDescriptors(3227) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3766) = FormalQtyType.StringType // TEMPLATE_DOM.NAME
    nodePropertyDescriptors(3767) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4126) = FormalQtyType.IntType // TEMPLATE_DOM.ORDER
    nodePropertyDescriptors(4127) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2058) = FormalQtyType.StringType // TYPE.FULL_NAME
    nodePropertyDescriptors(2059) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3768) = FormalQtyType.StringType // TYPE.NAME
    nodePropertyDescriptors(3769) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4848) = FormalQtyType.StringType // TYPE.TYPE_DECL_FULL_NAME
    nodePropertyDescriptors(4849) = FormalQtyType.QtyOne
    nodePropertyDescriptors(980) = FormalQtyType.StringType // TYPE_ARGUMENT.CODE
    nodePropertyDescriptors(981) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1070) = FormalQtyType.IntType // TYPE_ARGUMENT.COLUMN_NUMBER
    nodePropertyDescriptors(1071) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3230) = FormalQtyType.IntType // TYPE_ARGUMENT.LINE_NUMBER
    nodePropertyDescriptors(3231) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4130) = FormalQtyType.IntType // TYPE_ARGUMENT.ORDER
    nodePropertyDescriptors(4131) = FormalQtyType.QtyOne
    nodePropertyDescriptors(82) = FormalQtyType.StringType // TYPE_DECL.ALIAS_TYPE_FULL_NAME
    nodePropertyDescriptors(83) = FormalQtyType.QtyOption
    nodePropertyDescriptors(352) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(353) = FormalQtyType.QtyOne
    nodePropertyDescriptors(442) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_TYPE
    nodePropertyDescriptors(443) = FormalQtyType.QtyOne
    nodePropertyDescriptors(982) = FormalQtyType.StringType // TYPE_DECL.CODE
    nodePropertyDescriptors(983) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1072) = FormalQtyType.IntType // TYPE_DECL.COLUMN_NUMBER
    nodePropertyDescriptors(1073) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1972) = FormalQtyType.StringType // TYPE_DECL.FILENAME
    nodePropertyDescriptors(1973) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2062) = FormalQtyType.StringType // TYPE_DECL.FULL_NAME
    nodePropertyDescriptors(2063) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2152) = FormalQtyType.StringType // TYPE_DECL.GENERIC_SIGNATURE
    nodePropertyDescriptors(2153) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2602) = FormalQtyType.StringType // TYPE_DECL.INHERITS_FROM_TYPE_FULL_NAME
    nodePropertyDescriptors(2603) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2782) = FormalQtyType.BoolType // TYPE_DECL.IS_EXTERNAL
    nodePropertyDescriptors(2783) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3232) = FormalQtyType.IntType // TYPE_DECL.LINE_NUMBER
    nodePropertyDescriptors(3233) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3772) = FormalQtyType.StringType // TYPE_DECL.NAME
    nodePropertyDescriptors(3773) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3952) = FormalQtyType.IntType // TYPE_DECL.OFFSET
    nodePropertyDescriptors(3953) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4042) = FormalQtyType.IntType // TYPE_DECL.OFFSET_END
    nodePropertyDescriptors(4043) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4132) = FormalQtyType.IntType // TYPE_DECL.ORDER
    nodePropertyDescriptors(4133) = FormalQtyType.QtyOne
    nodePropertyDescriptors(984) = FormalQtyType.StringType // TYPE_PARAMETER.CODE
    nodePropertyDescriptors(985) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1074) = FormalQtyType.IntType // TYPE_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(1075) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3234) = FormalQtyType.IntType // TYPE_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(3235) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3774) = FormalQtyType.StringType // TYPE_PARAMETER.NAME
    nodePropertyDescriptors(3775) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4134) = FormalQtyType.IntType // TYPE_PARAMETER.ORDER
    nodePropertyDescriptors(4135) = FormalQtyType.QtyOne
    nodePropertyDescriptors(176) = FormalQtyType.IntType // TYPE_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(177) = FormalQtyType.QtyOne
    nodePropertyDescriptors(266) = FormalQtyType.StringType // TYPE_REF.ARGUMENT_NAME
    nodePropertyDescriptors(267) = FormalQtyType.QtyOption
    nodePropertyDescriptors(986) = FormalQtyType.StringType // TYPE_REF.CODE
    nodePropertyDescriptors(987) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1076) = FormalQtyType.IntType // TYPE_REF.COLUMN_NUMBER
    nodePropertyDescriptors(1077) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1706) = FormalQtyType.StringType // TYPE_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1707) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3236) = FormalQtyType.IntType // TYPE_REF.LINE_NUMBER
    nodePropertyDescriptors(3237) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4136) = FormalQtyType.IntType // TYPE_REF.ORDER
    nodePropertyDescriptors(4137) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4496) = FormalQtyType.StringType // TYPE_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(4497) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4946) = FormalQtyType.StringType // TYPE_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4947) = FormalQtyType.QtyOne
    nodePropertyDescriptors(178) = FormalQtyType.IntType // UNKNOWN.ARGUMENT_INDEX
    nodePropertyDescriptors(179) = FormalQtyType.QtyOne
    nodePropertyDescriptors(268) = FormalQtyType.StringType // UNKNOWN.ARGUMENT_NAME
    nodePropertyDescriptors(269) = FormalQtyType.QtyOption
    nodePropertyDescriptors(988) = FormalQtyType.StringType // UNKNOWN.CODE
    nodePropertyDescriptors(989) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1078) = FormalQtyType.IntType // UNKNOWN.COLUMN_NUMBER
    nodePropertyDescriptors(1079) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1258) = FormalQtyType.StringType // UNKNOWN.CONTAINED_REF
    nodePropertyDescriptors(1259) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1708) = FormalQtyType.StringType // UNKNOWN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1709) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3238) = FormalQtyType.IntType // UNKNOWN.LINE_NUMBER
    nodePropertyDescriptors(3239) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4138) = FormalQtyType.IntType // UNKNOWN.ORDER
    nodePropertyDescriptors(4139) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4408) = FormalQtyType.StringType // UNKNOWN.PARSER_TYPE_NAME
    nodePropertyDescriptors(4409) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4498) = FormalQtyType.StringType // UNKNOWN.POSSIBLE_TYPES
    nodePropertyDescriptors(4499) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4948) = FormalQtyType.StringType // UNKNOWN.TYPE_FULL_NAME
    nodePropertyDescriptors(4949) = FormalQtyType.QtyOne
    nodePropertyDescriptors
  }
  private val newNodeInsertionHelpers: Array[flatgraph.NewNodePropertyInsertionHelper] = {
    val _newNodeInserters = new Array[flatgraph.NewNodePropertyInsertionHelper](5490)
    _newNodeInserters(90) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_argumentIndex
    _newNodeInserters(180) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_argumentName
    _newNodeInserters(900) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_code
    _newNodeInserters(990) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_columnNumber
    _newNodeInserters(1980) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_fullName
    _newNodeInserters(3150) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_lineNumber
    _newNodeInserters(3690) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_name
    _newNodeInserters(4050) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_order
    _newNodeInserters(92) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_argumentIndex
    _newNodeInserters(182) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_argumentName
    _newNodeInserters(902) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_code
    _newNodeInserters(992) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_columnNumber
    _newNodeInserters(3152) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_lineNumber
    _newNodeInserters(3692) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_name
    _newNodeInserters(4052) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_order
    _newNodeInserters(904) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_code
    _newNodeInserters(994) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_columnNumber
    _newNodeInserters(3154) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_lineNumber
    _newNodeInserters(4054) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_order
    _newNodeInserters(906) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_code
    _newNodeInserters(996) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_columnNumber
    _newNodeInserters(3156) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_lineNumber
    _newNodeInserters(4056) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_order
    _newNodeInserters(98) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_argumentIndex
    _newNodeInserters(188) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_argumentName
    _newNodeInserters(908) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_code
    _newNodeInserters(998) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_columnNumber
    _newNodeInserters(3158) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_lineNumber
    _newNodeInserters(4058) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_order
    _newNodeInserters(3340) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_methodFullName
    _newNodeInserters(3700) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_name
    _newNodeInserters(4600) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_signature
    _newNodeInserters(102) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_argumentIndex
    _newNodeInserters(192) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_argumentName
    _newNodeInserters(912) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_code
    _newNodeInserters(1002) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_columnNumber
    _newNodeInserters(1632) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_dynamicTypeHintFullName
    _newNodeInserters(3162) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_lineNumber
    _newNodeInserters(4062) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_order
    _newNodeInserters(4422) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_possibleTypes
    _newNodeInserters(4872) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_typeFullName
    _newNodeInserters(104) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_argumentIndex
    _newNodeInserters(194) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_argumentName
    _newNodeInserters(914) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_code
    _newNodeInserters(1004) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_columnNumber
    _newNodeInserters(1544) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_dispatchType
    _newNodeInserters(1634) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_dynamicTypeHintFullName
    _newNodeInserters(3164) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_lineNumber
    _newNodeInserters(3344) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_methodFullName
    _newNodeInserters(3704) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_name
    _newNodeInserters(4064) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_order
    _newNodeInserters(4424) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_possibleTypes
    _newNodeInserters(4604) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_signature
    _newNodeInserters(4874) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_typeFullName
    _newNodeInserters(736) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_closureBindingId
    _newNodeInserters(826) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_closureOriginalName
    _newNodeInserters(1726) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_evaluationStrategy
    _newNodeInserters(918) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_code
    _newNodeInserters(1008) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_columnNumber
    _newNodeInserters(1908) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_filename
    _newNodeInserters(3168) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_lineNumber
    _newNodeInserters(4068) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_order
    _newNodeInserters(1280) = nodes.NewConfigFile.InsertionHelpers.NewNodeInserter_ConfigFile_content
    _newNodeInserters(3710) = nodes.NewConfigFile.InsertionHelpers.NewNodeInserter_ConfigFile_name
    _newNodeInserters(112) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_argumentIndex
    _newNodeInserters(202) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_argumentName
    _newNodeInserters(922) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_code
    _newNodeInserters(1012) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_columnNumber
    _newNodeInserters(1372) =
      nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_controlStructureType
    _newNodeInserters(3172) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_lineNumber
    _newNodeInserters(4072) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_order
    _newNodeInserters(4342) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_parserTypeName
    _newNodeInserters(1464) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_dependencyGroupId
    _newNodeInserters(3714) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_name
    _newNodeInserters(5064) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_version
    _newNodeInserters(116) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_argumentIndex
    _newNodeInserters(206) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_argumentName
    _newNodeInserters(476) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_canonicalName
    _newNodeInserters(926) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_code
    _newNodeInserters(1016) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_columnNumber
    _newNodeInserters(3176) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_lineNumber
    _newNodeInserters(4076) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_order
    _newNodeInserters(928) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_code
    _newNodeInserters(1018) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_columnNumber
    _newNodeInserters(1288) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_content
    _newNodeInserters(2188) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_hash
    _newNodeInserters(3178) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_lineNumber
    _newNodeInserters(3718) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_name
    _newNodeInserters(4078) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_order
    _newNodeInserters(5160) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_evidence
    _newNodeInserters(5250) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_keyValuePairs
    _newNodeInserters(122) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_argumentIndex
    _newNodeInserters(212) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_argumentName
    _newNodeInserters(932) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_code
    _newNodeInserters(1022) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_columnNumber
    _newNodeInserters(1652) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_dynamicTypeHintFullName
    _newNodeInserters(3182) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_lineNumber
    _newNodeInserters(3722) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_name
    _newNodeInserters(4082) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_order
    _newNodeInserters(4442) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_possibleTypes
    _newNodeInserters(4892) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_typeFullName
    _newNodeInserters(934) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_code
    _newNodeInserters(1024) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_columnNumber
    _newNodeInserters(1834) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_explicitAs
    _newNodeInserters(2284) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_importedAs
    _newNodeInserters(2374) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_importedEntity
    _newNodeInserters(2644) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_isExplicit
    _newNodeInserters(2914) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_isWildcard
    _newNodeInserters(3184) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_lineNumber
    _newNodeInserters(4084) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_order
    _newNodeInserters(936) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_code
    _newNodeInserters(1026) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_columnNumber
    _newNodeInserters(3186) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_lineNumber
    _newNodeInserters(3726) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_name
    _newNodeInserters(4086) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_order
    _newNodeInserters(4356) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_parserTypeName
    _newNodeInserters(128) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_argumentIndex
    _newNodeInserters(938) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_code
    _newNodeInserters(1028) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_columnNumber
    _newNodeInserters(3188) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_lineNumber
    _newNodeInserters(3728) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_name
    _newNodeInserters(4088) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_order
    _newNodeInserters(4358) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_parserTypeName
    _newNodeInserters(3010) = nodes.NewKeyValuePair.InsertionHelpers.NewNodeInserter_KeyValuePair_key
    _newNodeInserters(4990) = nodes.NewKeyValuePair.InsertionHelpers.NewNodeInserter_KeyValuePair_value
    _newNodeInserters(132) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_argumentIndex
    _newNodeInserters(222) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_argumentName
    _newNodeInserters(942) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_code
    _newNodeInserters(1032) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_columnNumber
    _newNodeInserters(1662) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_dynamicTypeHintFullName
    _newNodeInserters(3192) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_lineNumber
    _newNodeInserters(4092) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_order
    _newNodeInserters(4452) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_possibleTypes
    _newNodeInserters(4902) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_typeFullName
    _newNodeInserters(764) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_closureBindingId
    _newNodeInserters(944) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_code
    _newNodeInserters(1034) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_columnNumber
    _newNodeInserters(1664) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_dynamicTypeHintFullName
    _newNodeInserters(2114) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_genericSignature
    _newNodeInserters(3194) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_lineNumber
    _newNodeInserters(3734) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_name
    _newNodeInserters(4094) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_order
    _newNodeInserters(4454) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_possibleTypes
    _newNodeInserters(4904) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_typeFullName
    _newNodeInserters(586) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_className
    _newNodeInserters(676) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_classShortName
    _newNodeInserters(1936) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_filename
    _newNodeInserters(3196) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_lineNumber
    _newNodeInserters(3376) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_methodFullName
    _newNodeInserters(3466) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_methodShortName
    _newNodeInserters(3826) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_nodeLabel
    _newNodeInserters(4276) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_packageName
    _newNodeInserters(4726) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_symbol
    _newNodeInserters(5356) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_node
    _newNodeInserters(318) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_astParentFullName
    _newNodeInserters(408) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_astParentType
    _newNodeInserters(948) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_code
    _newNodeInserters(1038) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_columnNumber
    _newNodeInserters(1668) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_dynamicTypeHintFullName
    _newNodeInserters(2118) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_genericSignature
    _newNodeInserters(3198) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_lineNumber
    _newNodeInserters(3738) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_name
    _newNodeInserters(4098) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_order
    _newNodeInserters(4458) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_possibleTypes
    _newNodeInserters(4908) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_typeFullName
    _newNodeInserters(2210) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_hash
    _newNodeInserters(3110) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_language
    _newNodeInserters(4190) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_overlays
    _newNodeInserters(4550) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_root
    _newNodeInserters(5090) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_version
    _newNodeInserters(322) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_astParentFullName
    _newNodeInserters(412) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_astParentType
    _newNodeInserters(952) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_code
    _newNodeInserters(1042) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_columnNumber
    _newNodeInserters(1132) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_columnNumberEnd
    _newNodeInserters(1942) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_filename
    _newNodeInserters(2032) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_fullName
    _newNodeInserters(2122) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_genericSignature
    _newNodeInserters(2212) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_hash
    _newNodeInserters(2752) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_isExternal
    _newNodeInserters(3202) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_lineNumber
    _newNodeInserters(3292) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_lineNumberEnd
    _newNodeInserters(3742) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_name
    _newNodeInserters(3922) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_offset
    _newNodeInserters(4012) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_offsetEnd
    _newNodeInserters(4102) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_order
    _newNodeInserters(4642) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_signature
    _newNodeInserters(774) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_closureBindingId
    _newNodeInserters(954) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_code
    _newNodeInserters(1044) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_columnNumber
    _newNodeInserters(1674) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_dynamicTypeHintFullName
    _newNodeInserters(1764) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_evaluationStrategy
    _newNodeInserters(2484) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_index
    _newNodeInserters(2844) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_isVariadic
    _newNodeInserters(3204) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_lineNumber
    _newNodeInserters(3744) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_name
    _newNodeInserters(4104) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_order
    _newNodeInserters(4464) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_possibleTypes
    _newNodeInserters(4914) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_typeFullName
    _newNodeInserters(956) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_code
    _newNodeInserters(1046) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_columnNumber
    _newNodeInserters(1766) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_evaluationStrategy
    _newNodeInserters(2486) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_index
    _newNodeInserters(2846) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_isVariadic
    _newNodeInserters(3206) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_lineNumber
    _newNodeInserters(3746) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_name
    _newNodeInserters(4106) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_order
    _newNodeInserters(4916) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_typeFullName
    _newNodeInserters(148) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_argumentIndex
    _newNodeInserters(238) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_argumentName
    _newNodeInserters(958) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_code
    _newNodeInserters(1048) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_columnNumber
    _newNodeInserters(1678) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_dynamicTypeHintFullName
    _newNodeInserters(3208) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_lineNumber
    _newNodeInserters(3388) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_methodFullName
    _newNodeInserters(4108) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_order
    _newNodeInserters(4468) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_possibleTypes
    _newNodeInserters(4918) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_typeFullName
    _newNodeInserters(960) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_code
    _newNodeInserters(1050) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_columnNumber
    _newNodeInserters(1680) =
      nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_dynamicTypeHintFullName
    _newNodeInserters(1770) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_evaluationStrategy
    _newNodeInserters(3210) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_lineNumber
    _newNodeInserters(4110) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_order
    _newNodeInserters(4470) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_possibleTypes
    _newNodeInserters(4920) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_typeFullName
    _newNodeInserters(962) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_code
    _newNodeInserters(1052) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_columnNumber
    _newNodeInserters(3212) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_lineNumber
    _newNodeInserters(3572) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_modifierType
    _newNodeInserters(4112) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_order
    _newNodeInserters(3664) = nodes.NewMynodetype.InsertionHelpers.NewNodeInserter_Mynodetype_myproperty
    _newNodeInserters(966) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_code
    _newNodeInserters(1056) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_columnNumber
    _newNodeInserters(3216) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_lineNumber
    _newNodeInserters(3756) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_name
    _newNodeInserters(4116) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_order
    _newNodeInserters(968) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_code
    _newNodeInserters(1058) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_columnNumber
    _newNodeInserters(1958) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_filename
    _newNodeInserters(2048) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_fullName
    _newNodeInserters(3218) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_lineNumber
    _newNodeInserters(3758) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_name
    _newNodeInserters(4118) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_order
    _newNodeInserters(160) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_argumentIndex
    _newNodeInserters(250) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_argumentName
    _newNodeInserters(970) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_code
    _newNodeInserters(1060) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_columnNumber
    _newNodeInserters(3220) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_lineNumber
    _newNodeInserters(4120) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_order
    _newNodeInserters(3762) = nodes.NewTag.InsertionHelpers.NewNodeInserter_Tag_name
    _newNodeInserters(5022) = nodes.NewTag.InsertionHelpers.NewNodeInserter_Tag_value
    _newNodeInserters(5384) = nodes.NewTagNodePair.InsertionHelpers.NewNodeInserter_TagNodePair_node
    _newNodeInserters(5474) = nodes.NewTagNodePair.InsertionHelpers.NewNodeInserter_TagNodePair_tag
    _newNodeInserters(166) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_argumentIndex
    _newNodeInserters(256) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_argumentName
    _newNodeInserters(976) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_code
    _newNodeInserters(1066) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_columnNumber
    _newNodeInserters(3226) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_lineNumber
    _newNodeInserters(3766) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_name
    _newNodeInserters(4126) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_order
    _newNodeInserters(2058) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_fullName
    _newNodeInserters(3768) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_name
    _newNodeInserters(4848) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_typeDeclFullName
    _newNodeInserters(980) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_code
    _newNodeInserters(1070) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_columnNumber
    _newNodeInserters(3230) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_lineNumber
    _newNodeInserters(4130) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_order
    _newNodeInserters(82) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_aliasTypeFullName
    _newNodeInserters(352) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_astParentFullName
    _newNodeInserters(442) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_astParentType
    _newNodeInserters(982) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_code
    _newNodeInserters(1072) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_columnNumber
    _newNodeInserters(1972) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_filename
    _newNodeInserters(2062) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_fullName
    _newNodeInserters(2152) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_genericSignature
    _newNodeInserters(2602) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_inheritsFromTypeFullName
    _newNodeInserters(2782) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_isExternal
    _newNodeInserters(3232) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_lineNumber
    _newNodeInserters(3772) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_name
    _newNodeInserters(3952) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_offset
    _newNodeInserters(4042) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_offsetEnd
    _newNodeInserters(4132) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_order
    _newNodeInserters(984) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_code
    _newNodeInserters(1074) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_columnNumber
    _newNodeInserters(3234) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_lineNumber
    _newNodeInserters(3774) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_name
    _newNodeInserters(4134) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_order
    _newNodeInserters(176) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_argumentIndex
    _newNodeInserters(266) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_argumentName
    _newNodeInserters(986) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_code
    _newNodeInserters(1076) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_columnNumber
    _newNodeInserters(1706) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_dynamicTypeHintFullName
    _newNodeInserters(3236) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_lineNumber
    _newNodeInserters(4136) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_order
    _newNodeInserters(4496) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_possibleTypes
    _newNodeInserters(4946) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_typeFullName
    _newNodeInserters(178) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_argumentIndex
    _newNodeInserters(268) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_argumentName
    _newNodeInserters(988) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_code
    _newNodeInserters(1078) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_columnNumber
    _newNodeInserters(1258) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_containedRef
    _newNodeInserters(1708) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_dynamicTypeHintFullName
    _newNodeInserters(3238) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_lineNumber
    _newNodeInserters(4138) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_order
    _newNodeInserters(4408) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_parserTypeName
    _newNodeInserters(4498) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_possibleTypes
    _newNodeInserters(4948) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_typeFullName
    _newNodeInserters
  }
  override def getNumberOfNodeKinds: Int              = 45
  override def getNumberOfEdgeKinds: Int              = 24
  override def getNodeLabel(nodeKind: Int): String    = nodeLabels(nodeKind)
  override def getNodeKindByLabel(label: String): Int = nodeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getEdgeLabel(nodeKind: Int, edgeKind: Int): String = edgeLabels(edgeKind)
  override def getEdgeKindByLabel(label: String): Int = edgeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNodePropertyNames(nodeLabel: String): Set[String] = {
    nodeLabel match {
      case "ANNOTATION" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "FULL_NAME", "LINE_NUMBER", "NAME", "ORDER")
      case "ANNOTATION_LITERAL" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "ANNOTATION_PARAMETER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "ANNOTATION_PARAMETER_ASSIGN" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "ARRAY_INITIALIZER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "BINDING" => Set("METHOD_FULL_NAME", "NAME", "SIGNATURE")
      case "BLOCK" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "CALL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DISPATCH_TYPE",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "SIGNATURE",
          "TYPE_FULL_NAME"
        )
      case "CLOSURE_BINDING" => Set("CLOSURE_BINDING_ID", "CLOSURE_ORIGINAL_NAME", "EVALUATION_STRATEGY")
      case "COMMENT"         => Set("CODE", "COLUMN_NUMBER", "FILENAME", "LINE_NUMBER", "ORDER")
      case "CONFIG_FILE"     => Set("CONTENT", "NAME")
      case "CONTROL_STRUCTURE" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTROL_STRUCTURE_TYPE",
          "LINE_NUMBER",
          "ORDER",
          "PARSER_TYPE_NAME"
        )
      case "DEPENDENCY" => Set("DEPENDENCY_GROUP_ID", "NAME", "VERSION")
      case "FIELD_IDENTIFIER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CANONICAL_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "FILE"    => Set("CODE", "COLUMN_NUMBER", "CONTENT", "HASH", "LINE_NUMBER", "NAME", "ORDER")
      case "FINDING" => Set()
      case "IDENTIFIER" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "IMPORT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EXPLICIT_AS",
          "IMPORTED_AS",
          "IMPORTED_ENTITY",
          "IS_EXPLICIT",
          "IS_WILDCARD",
          "LINE_NUMBER",
          "ORDER"
        )
      case "JUMP_LABEL" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER", "PARSER_TYPE_NAME")
      case "JUMP_TARGET" =>
        Set("ARGUMENT_INDEX", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER", "PARSER_TYPE_NAME")
      case "KEY_VALUE_PAIR" => Set("KEY", "VALUE")
      case "LITERAL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCAL" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "GENERIC_SIGNATURE",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCATION" =>
        Set(
          "CLASS_NAME",
          "CLASS_SHORT_NAME",
          "FILENAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "METHOD_SHORT_NAME",
          "NODE_LABEL",
          "PACKAGE_NAME",
          "SYMBOL"
        )
      case "MEMBER" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "GENERIC_SIGNATURE",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "META_DATA" => Set("HASH", "LANGUAGE", "OVERLAYS", "ROOT", "VERSION")
      case "METHOD" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "COLUMN_NUMBER_END",
          "FILENAME",
          "FULL_NAME",
          "GENERIC_SIGNATURE",
          "HASH",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "LINE_NUMBER_END",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "SIGNATURE"
        )
      case "METHOD_PARAMETER_IN" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_PARAMETER_OUT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "TYPE_FULL_NAME"
        )
      case "METHOD_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_RETURN" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "MODIFIER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "MODIFIER_TYPE", "ORDER")
      case "MYNODETYPE"      => Set("MYPROPERTY")
      case "NAMESPACE"       => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "NAMESPACE_BLOCK" => Set("CODE", "COLUMN_NUMBER", "FILENAME", "FULL_NAME", "LINE_NUMBER", "NAME", "ORDER")
      case "RETURN"          => Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "TAG"             => Set("NAME", "VALUE")
      case "TAG_NODE_PAIR"   => Set()
      case "TEMPLATE_DOM" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "TYPE"          => Set("FULL_NAME", "NAME", "TYPE_DECL_FULL_NAME")
      case "TYPE_ARGUMENT" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "TYPE_DECL" =>
        Set(
          "ALIAS_TYPE_FULL_NAME",
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "FILENAME",
          "FULL_NAME",
          "GENERIC_SIGNATURE",
          "INHERITS_FROM_TYPE_FULL_NAME",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "TYPE_PARAMETER" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "TYPE_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "UNKNOWN" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTAINED_REF",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "PARSER_TYPE_NAME",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case _ => Set.empty
    }
  }
  override def getEdgePropertyName(label: String): Option[String] = {
    label match {
      case "REACHING_DEF" => Some("VARIABLE")
      case _              => None
    }
  }

  override def getPropertyLabel(nodeKind: Int, propertyKind: Int): String = {
    if (propertyKind < 57) normalNodePropertyNames(propertyKind)
    else if (propertyKind == 57 && nodeKind == 15) "evidence"      /*on node FINDING*/
    else if (propertyKind == 58 && nodeKind == 15) "keyValuePairs" /*on node FINDING*/
    else if (propertyKind == 59 && nodeKind == 23) "node"          /*on node LOCATION*/
    else if (propertyKind == 59 && nodeKind == 37) "node"          /*on node TAG_NODE_PAIR*/
    else if (propertyKind == 60 && nodeKind == 37) "tag"           /*on node TAG_NODE_PAIR*/
    else null
  }

  override def getPropertyKindByName(label: String): Int =
    nodePropertyByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNumberOfPropertyKinds: Int = 61
  override def makeNode(graph: flatgraph.Graph, nodeKind: Short, seq: Int): nodes.StoredNode =
    nodeFactories(nodeKind)(graph, seq)
  override def makeEdge(
    src: flatgraph.GNode,
    dst: flatgraph.GNode,
    edgeKind: Short,
    subSeq: Int,
    property: Any
  ): flatgraph.Edge = edgeFactories(edgeKind)(src, dst, subSeq, property)
  override def allocateEdgeProperty(
    nodeKind: Int,
    direction: flatgraph.Edge.Direction,
    edgeKind: Int,
    size: Int
  ): Array[?] = edgePropertyAllocators(edgeKind)(size)
  override def getNodePropertyFormalType(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalType =
    nodePropertyDescriptors(propertyOffsetArrayIndex(nodeKind, propertyKind)).asInstanceOf[FormalQtyType.FormalType]
  override def getNodePropertyFormalQuantity(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalQuantity =
    nodePropertyDescriptors(1 + propertyOffsetArrayIndex(nodeKind, propertyKind))
      .asInstanceOf[FormalQtyType.FormalQuantity]

  override def getNewNodePropertyInserter(nodeKind: Int, propertyKind: Int): flatgraph.NewNodePropertyInsertionHelper =
    newNodeInsertionHelpers(propertyOffsetArrayIndex(nodeKind, propertyKind))
}
