// for EXPRESSIONS
// Used for transforming data

val xs = List(1, 2, 3)
val ys = for x <- xs yield x * 2

val ys2 =
  for
    x <- xs
  yield
    x * 2

// Generators, definitions, and guards

case class Person(firstName: String, lastName: String)

val people = List(
  Person("betty", "rubble"),
  Person("barney", "rubble"),
  Person("wilma", "flintstone"),
  Person("fred", "flintstone")
)

val rez1 = for
  p <- people
yield
  s"${p.firstName.capitalize}"

val rez2 = for
  p <- people
  fName = p.firstName
yield
  s"${fName.capitalize}"

val rez3 = for
  p <- people
  fName = p.firstName
  if fName.startsWith("b")
yield
  s"${fName.capitalize}"

// NOTE:
// They're only a series of
// - maps
// - flatMaps
// - filters