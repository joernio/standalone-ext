package org.codeminers.standalone

import io.joern.console.BridgeBase
import io.joern.joerncli.console.RunBeforeCode

/** Extend/use joern as a REPL application */
object ReplMain extends BridgeBase {

  def main(args: Array[String]): Unit = {
    run(parseConfig(args))
  }

  override protected def runBeforeCode = {
    RunBeforeCode.forInteractiveShell ++ Seq(s"import _root_.${getClass.getPackageName}.*")
  }

  override protected def promptStr  = "joern-sample-ext"
  override protected def greeting   = "Welcome to the wonderful world of this sample joern extension!"
  override protected def onExitCode = """println("goodbye!")"""
  override def applicationName      = "joern-sample-ext"
}
