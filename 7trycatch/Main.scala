import java.io.FileNotFoundException
import java.io.IOException
import scala.io.Source

object Main extends App {
  var text = ""
  try {
    val filePointer = Source.fromFile("hello.txt")
    text = filePointer.getLines.mkString("\n")
    println("{" + text + "}")
  } catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException =>
      println("Had an IOException trying to read that file")
    case _: Throwable => println("something else")
  }
}
