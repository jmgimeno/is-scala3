// Constructor parameters are defined in the class signature

class Person(val firstName: String, val lastName: String)

val john = Person("John", "Doe")
val mary = Person("Mary", "Doe")

println(john.firstName)
println(john.lastName)

// We have defined them with VAl -> immutable (FP style)

// john.firstName = "Jonathan"

// You can define them with VAR -> mutable (OOP style)

class Animal(val name: String, val age: Int)

val dog = Animal("Buddy", 3)
//dog.age += 1



