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
  println("---")
  def evenOrOdd(i: Int): Unit = i match {
    case 1 | 3 | 5 | 7 | 9  => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _                  => println("some other number")
  }
  evenOrOdd(1)
  evenOrOdd(2)
}
