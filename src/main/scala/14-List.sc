// Immutable and linear sequence

// Single linked list !!

val nums = List(1, 2, 3, 4, 5)
val num2 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

nums(0)
nums(1)

nums.head
nums.tail

for n <- nums do println(n)

val names = List("bert", "ernie")
val capNames = for name <- names yield name.capitalize

val capNames2 = names.map(_.capitalize)

// "Updating" a List (creates a new List)
val a = List(1, 2, 3)
val b = List(4, 5, 6)
val c = a ++ b

val a2 = List(1, 2, 3)
val b2 = a2.updated(index = 0, elem = 10)
val c2 = b2.updated(1, 20)

// "Deleting" elements (creates a new List)

val a3 = List(5, 1, 4, 3, 2)
val b3 = a3.filter(_ > 2)
val b4 = a3.take(2)
val b5 = a3.drop(2)

// Prepending elements
val a4 = List(3)
val a5 = 2 :: a4
val a6 = 1 :: a5

val a7 = List(3, 4)
val a8 = List(1, 2) ::: a7

// Breaking a list in matching
def sum(xs: List[Int]): Int = xs match
  case Nil => 0
  case head :: tail => head + sum(tail)

// More examples: https://alvinalexander.com/scala/list-class-methods-examples-syntax/


