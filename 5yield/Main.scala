object Main extends App{
    val nums = Seq(1,2,3)
    println("nums>" + nums.mkString(" "))
    val newnums = for(n <- nums) yield n * 2
    println("newnums>" + newnums.mkString(" "))
    // val newnewnums = newnums.foreach{case _ => _ ** 2}
    // println("newnewnums>" + newnewnums.mkString(" "))
    // for(n <- nums )println(n)
}