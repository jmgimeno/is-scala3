// if-then-else EXPRESSIONS

val a = 5
val b = 10

// Scala 2 brace syntax (also valid in Scala 3)

if (a < b) {
  println("less")
} else {
  println("more")
}

// Scala 3 brace-less syntax

if a < b then
  println("less")
else
  println("more")

if a < b then
  println("less")
else
  println("more")
end if

// val rez = a < b ? a : b  // ternary operator in Java / C# / JavaScript   
val rez = if a < b then a else b
