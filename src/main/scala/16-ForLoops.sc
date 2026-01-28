// for STATEMENTS
// Used for side-effects
// We won't use much

val ints = List(1, 2, 3)

// ints is a generator

for i <- ints do println(i)

for
  i <- ints
do
  println(i)

// Old-style braces syntax

for (i <- ints)
  println(i)

for (i <- ints) {
  println(i)
}

// Multiple generators

for
  i <- 1 to 2
  j <- 'a' to 'b'
do
  println(s"i = $i, j = $j")

// Loop with guards

for
  i <- 1 to 2
  if i % 2 == 0
  j <- 'a' to 'b'
  k <- 1 to 10 by 5
do
  println(s"i = $i, j = $j, k = $k")

// for loop with map

val statesMap = Map(
  "AK" -> "Alaska",
  "AL" -> "Alabama",
  "AR" -> "Arizona"
)

for
  (k, v) <- statesMap
do
  println(s"$k stands for $v")
