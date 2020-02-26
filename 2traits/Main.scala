trait Speaker {
    def speak(): String  // has no body, so it’s abstract
}

trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
    def startRunning(): Unit = println("I’m running")
    def stopRunning(): Unit = println("Stopped running")
}

class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
}

class Cat extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah ... I don’t run")
    override def stopRunning(): Unit = println("No need to stop")
}

object Main extends App{
    println(s"number of cli args: ${args.length}")
    println(s"first arg: ${args(0)}")
    // println(args(1))
    val dog = new Dog("shepy")
    val cat = new Cat()
    println(dog.speak())
    dog.startTail()
    dog.startRunning()
    dog.stopRunning()
    dog.stopTail()
    println(cat.speak())
    cat.startRunning()
    cat.stopRunning()
}