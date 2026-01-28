// Returns a new collection containing only
// the elements that satisfy a given predicate.

val xs = (1 to 10).toList

val smalls = xs.filter(_ < 5)
val larges = xs.filter(_ > 5)
val oops = xs.filter(_ > 100)

// Like for/yield expression with guard

val ys =
  for
    x <- xs
    if x > 5
  yield
    x

// filter and filterNot

val a = (0 to 100 by 10).toVector
a.filter(_ < 20)
a.filter(_ > 1_000)
a.filterNot(_ < 45)