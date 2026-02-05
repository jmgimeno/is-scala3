// Statements vs Expressions

val a = 5
val b = 10

println("hi")
if a == b then println("equal")

// if/then/else is an expression

val min = if a < b then a else b

def min(a: Int, b: Int): Int =
  if a < b then a else b

// match is an expression

val i = 5

val evenOrOdd = i match
  case 1 | 3 | 5 | 7 | 9 => "odd"
  case 2 | 4 | 6 | 8 | 10 => "even"
  case _ => "other"

// for is an expression

val xs = List(1, 2, 3)

// for (var x : xs) { ... }

for (x <- xs) do println(x)

// ys = [for x in xs: x * 2] in Python

// ys = []
// fpr x in xs:
//   ys.append(x * 2)

val ys = for x <- xs yield x * 2

// try/catch is an expression

def makeInt(s: String): Int =
  try
    s.toInt
  catch
    case e: Exception => 0

// Expressions can be used as function bodies

def makeInt2(s: String): Option[Int] =
  try
    Some(s.toInt)
  catch
    case _: NumberFormatException => None

def isTrue(a: Matchable): Boolean = a match
  case 0 | "" | "0" | false => false
  case _     => true

def min2(a: Int, b: Int): Int =
  if a < b then a else b



