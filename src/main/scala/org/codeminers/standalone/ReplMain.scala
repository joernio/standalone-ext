package org.codeminers.standalone

import io.joern.console.{BridgeBase, JoernProduct}
import io.joern.joerncli.console.Predefined

/** Extend/use joern as a REPL application */
object ReplMain extends BridgeBase {

  def main(args: Array[String]): Unit = {
    run(parseConfig(args))
  }

  override protected def predefLines = {
    Predefined.forInteractiveShell ++ Seq(
      s"import _root_.${getClass.getPackageName}.*"
    )
  }

  override protected def promptStr = "joern-sample-ext"
  override protected def greeting = "Welcome to the wonderful world of this sample joern extension!"
  override protected def onExitCode = """println("goodbye!")"""
  override def slProduct = JoernProduct
}
