class Greeter(name: String, value: String) {
    def greet(): Unit = {
        println("[" + name + "] > hello" + value )
    }
}

// val greeter = new Greeter("sharif", "there")
// greeter.greet()