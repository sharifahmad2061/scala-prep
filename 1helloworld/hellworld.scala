class Person(val firstName: String, val lastName: String) {
    def printFullName() = println(s"$firstName $lastName")
}
object Hello extends App {
    val person = new Person("sharif", "ahmad")
    person.printFullName()
    // person.firstName = "Tahir"
    person.printFullName()
    println("Hello, world")
}
