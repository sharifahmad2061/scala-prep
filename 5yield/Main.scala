object Main extends App{
    val nums = Seq(1,2,3)
    println("nums>" + nums.mkString(" "))
    val newnums = for(n <- nums) yield n * 2
    println("newnums>" + newnums.mkString(" "))
    val names = List("_adam", "_david", "_frank")
    val newnames = for(name <- names) yield{
        val namewithoutunderscore = name.drop(1)
        val capitalname = namewithoutunderscore.capitalize
        capitalname
    }
    newnames.foreach(print)
    println()
    (
        for(name <- names) 
            yield name.drop(1).toUpperCase()
    )
    .foreach(println)
}