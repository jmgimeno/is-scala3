import scala.collection.mutable.ArrayBuffer
// - Immutable vs Mutable

// Immutable     |  Mutable
// ----------------------------
// List, Vector  |  ArrayBuffer
// Map           |  Map
// Set           |  Set

// - Indexed vs Linear

// Indexed     |  Linear
// ----------------------------
// Vector      |  List
// ArrayBuffer
// Seq

// Common Types

// Vector is an immutable, indexed sequence
// List is an immutable, linear sequence
// ArrayBuffer is a mutable, indexed sequence
// We use other types like Map, Set, Range, ...

// Array wraps Java arrays (not much used)

val a = Vector(1, 2, 3)
val b = List(1, 2, 3)
val c = ArrayBuffer(1, 2, 3)
val d = Set(1, 1, 1, 2, 2, 2, 3)

// Map

val m1 = Map("a" -> 1, "b" -> 2)

val m3 = Map(("a", 1), ("b", 2))

val m2 = Map(
  "first_name" -> "Alvin",
  "last_name"  -> "Alexander"
)

// -> makes a pair
1 -> 2

// Range
1 until 10
1 until 10 by 2

1 to 10
1 to 10 by 2

'a' to 'e'
'a' to 'e' by 2

for i <- 1 to 10 yield i * 10

// More examples:

// Vector: https://alvinalexander.com/scala/vector-class-methods-syntax-examples/
// List: https://alvinalexander.com/scala/list-class-methods-examples-syntax/
// Map: https://alvinalexander.com/scala/scala-maps-map-class-examples/
// ArrayBuffer: https://alvinalexander.com/scala/arraybuffer-class-methods-syntax-examples-reference/
// Range: https://alvinalexander.com/scala/how-to-use-range-class-in-scala-cookbook/

