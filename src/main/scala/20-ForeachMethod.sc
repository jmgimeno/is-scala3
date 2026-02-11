// Available in all collections

val ints = List(1, 2, 3)

ints.foreach((i: Int) => println(i))

ints.foreach(i => println(i))

ints.foreach(println(_))

ints.foreach(println)

// Use in functions

def foreachInt(xs: Seq[Int], f: Int => Unit): Unit =
  for x <- xs do f(x)

def foreachGeneric[A](xs: Seq[A], f: A => Unit): Unit =
  for x <- xs do f(x)

ints.foreach { i =>
  val x = i * 10
  println(x)
}

foreachGeneric(ints, i => {
  val x = i * 20
  println(x)
})

def foreachGeneric2[A](xs: Seq[A])(f: A => Unit): Unit =
  for x <- xs do f(x)

foreachGeneric2(ints)(i => {
  val x = i * 20
  println(x)
})

foreachGeneric2(ints) { i =>
  val x = i * 20
  println(x)
}

// There is great flexibility for calling a function.

foreachGeneric2(ints):
  i =>
    val x = i * 20
    println(x)

def factorial(n: Int): Int =
  if n == 0 then 1 else n * factorial(n - 1)
  
factorial(20)

factorial {
  val x = 10 + 10
  x
}

factorial:
  val x = 10 + 10
  x

