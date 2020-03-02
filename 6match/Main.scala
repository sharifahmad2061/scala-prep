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
  println("---")
  def partyCount(count: Int): Unit = count match {
    case 1 => {
      println("one, a lonely number")
    }
    case x if x == 2 || x == 3 => println("two's company, three's a crowd")
    case x if (x > 3)          => println("4+, that's a party")
    case _                     => println("i'm guessing your number is zero or less")
  }
  partyCount(0)
  partyCount(1)
  partyCount(2)
  partyCount(4)
  println("---")
  def guessTheNumber(i: Int): Unit = i match {
    case a if 0 to 9 contains a   => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case c if 20 to 29 contains c => println("20-29 range: " + c)
    case _                        => println("Hmmm...")
  }
  guessTheNumber(2)
  guessTheNumber(45)
  guessTheNumber(23)
}
