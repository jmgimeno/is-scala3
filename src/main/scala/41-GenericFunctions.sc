// Functions can have generic type parameters

def randomElement[A](names: Seq[A]): A =
  val seqLength = names.length
  val randomNum = util.Random.nextInt(seqLength)
  names(randomNum)

val names = Seq("Alice", "Bob", "Charlie", "Diana")
val winner = randomElement(names)
println(s"The winner is: $winner")

val dice = 1 to 6
val roll = randomElement(dice)
println(s"The roll of the dice is: $roll")