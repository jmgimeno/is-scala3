// Transforms each element of a collection using a provided function.

val xs = List(1, 2, 3)

xs.map((x: Int) => x * 2)
xs.map(x => x * 2)
xs.map(_ * 2)

// The result can be of another type

val ys = List("big", "belly", "burger")

ys.map(y => y.length)
ys.map(_.length)

// It's the same as a for expression with yield

for y <- ys yield y.length

// map method with Map collection

val states = Map(
  "ak" -> "alaska",
  "al" -> "alabama"
)

val newMap = states.map((k, v) => (k.toUpperCase, v.toUpperCase))
val a = Map(
  1 -> 'a',
  2 -> 'b'
)

val b = a.map((k, v) => (k, v.toUpper))
val c = a.map((k, v) => (k.toDouble, v.toUpper))

val d = a.map { (k, v) =>
  (k, v.toUpper)
}