// All the parameters we've seen so far are passed by value.
// This means that the argument expression is evaluated before the function is called,
// and the resulting value is passed to the function.

// However, Scala also supports call-by-name parameters,
// which are evaluated each time they are used within the function.

// This can be useful for delaying computation or avoiding unnecessary work.

import scala.util.Random

def repeat(n: Int)(block: => Unit): Unit =
  for _ <- 1 to n do
    block
end repeat

repeat(3) {
  val randomNum = Random.nextInt(100)
  println(s"Generated random number: $randomNum")
}
