// A Scala tuple is a collection of two or more elements,
// and those elements can be of any type.

val t = (1, 2.2, 3L, 'a', "yo")
t(0)
t(1)

// Old (Scala 2) way to access tuple elements
t._1
t._2

// Destructuring
val (i, d, l, c, s) = (1, 2.2, 3L, 'a', "yo")

// Tuples are somewhat equivalent to case classes

case class Person(firstName: String, lastName: String)
val a = Person("Walter", "Bishop")

val b = ("Walter", "Bishop")

// Returning "multiple values" from a function

def getUserInfo: (String, Int, Double) =
  // do some stuff here, then return a 3-element tuple
  ("Al", 42, 200.0)

val (name, age, weight) = getUserInfo