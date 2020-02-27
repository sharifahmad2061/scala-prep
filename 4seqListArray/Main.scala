object Main extends App{
    val nums = Seq(1,2,3)
    for (n <- nums ){
        println(n)
    }
    val people = List(
        "Bill", 
        "Candy", 
        "Karen", 
        "Leo", 
        "Regina"
    )
    for (p <- people){
        println(p)
    }
    val ratings = Map(
        "Lady in the Water"  -> 3.0, 
        "Snakes on a Plane"  -> 4.0, 
        "You, Me and Dupree" -> 3.5
    )
    ratings.foreach{
        case (movie, rating) => println(s"key: ${movie}, value: ${rating}")
    }
}