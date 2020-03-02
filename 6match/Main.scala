object Main extends App {
  def convertBooleanToString(bool: Boolean): String = bool match {
    case true  => "you said true"
    case false => "you said false"
  }
  var ret = convertBooleanToString(true)
  println(ret)
  ret = convertBooleanToString(false)
  println(ret)
}
