object Main extends App {
  def convertBooleanToString(bool: Boolean): String = bool match {
    case true  => "you said true"
    case false => "you said false"
  }
  def isTrue(a: Any): Boolean = a match {
    case 0 | "" => false
    case _      => true
  }
  var ret = convertBooleanToString(true)
  println(ret)
  ret = convertBooleanToString(false)
  println(ret)
  println("---")
  var ret1: Boolean = isTrue("hello")
  println(ret1)
//   ret = 
  println(isTrue(0))
  ret1 = isTrue("")
  println(ret1)
}
