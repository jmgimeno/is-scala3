// Like a regular class with additional built-in features
// - apply method in companion object
// - constructor parameters with val fields
// - unapply to do pattern matching
// - copy method to create modified copies
// - equals and hashCode methods
// - nice toString method

// A simple example
case class Person(firstName: String, lastName: String)

val a = Person("Reginald", "Dwight")

a.firstName
a.lastName

val b = a.copy(firstName = "Elton")

b.firstName
b.lastName

val c = Person("Reginald", "Dwight")
a == b
a == c

// Can extend traits

trait Animal

case class Dog(name: String) extends Animal

case class Cat(name: String) extends Animal

// Use in pattern matching

def speak(a: Animal): String = a match
  case Dog(name) => s"Dog ‘$name’ says woof"
  case Cat(name) => s"Cat ‘$name’ says meow"

val r = Dog("Rover")
val m = Cat("Morris")
speak(r)
speak(m)