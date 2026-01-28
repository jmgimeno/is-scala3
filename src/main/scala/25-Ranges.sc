// Many types of ranges

// Using infix methods

1 to 5
1.to(5)

// Inclusive range

1 to 5
0 to 10 by 2
0 to 100 by 10

// Exclusive range

1 until 5
0 until 10 by 2
0 until 100 by 10

// In for expressions

val xs = for i <- 1 to 3 yield i * 10

// Converting to another collection type

(1 to 10).toList
(1 to 10).toVector

// Laziness

val r = 1 to Int.MaxValue // nothing happens

// these are all lazy
r.take(1)
r.drop(1)
r.distinct
r.tail

// this forces the action
r.filter(_ > 100)
r.map(_ * 2)
