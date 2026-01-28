// Immutable and indexed sequence

// Creating

val a = Vector(1, 2, 3)

case class Person(name: String)

val people = Vector(
  Person("Emily"),
  Person("Hannah"),
  Person("Mercedes")
)

val x = (1 to 100).toVector
val y = (0 to 100 by 5).toVector

// Accessing elements

val names = Vector("bert", "ernie", "oscar")
names(0) // "bert"
names(1) // "ernie"
names(2) // "oscar"

for name <- names do println(name)
val capNames = for name <- names yield name.capitalize

// "Updating" a Vector (creates a new Vector)

val v1 = Vector(4, 5, 6)
val v2 = v1 :+ 7
val v3 = v2 ++ Seq(8, 9)
val v4 = 3 +: v3
val v5 = Seq(1, 2) ++: v4

// "Deleting" elements (creates a new Vector)

val a1 = Vector(10, 20, 30, 40, 10)
a1.distinct
a1.drop(2)
a1.dropRight(2)
a1.dropWhile(_ < 25)
a1.filter(_ < 25)
a1.filter(_ > 100)
a1.find(_ > 20)
a1.slice(2, 4)
a1.take(3)
a1.takeRight(2)
a1.takeWhile(_ < 30)

// Other methods

val x2 = Vector(1, 2, 1, 2)
x2.distinct
x2.map(_ * 2)
x2.updated(0, 100)


// More examples: https://alvinalexander.com/scala/vector-class-methods-syntax-examples/
