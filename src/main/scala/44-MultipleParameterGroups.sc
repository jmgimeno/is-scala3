// Functions can have multiple parameter groups

def sum(a: Int)(b: Int): Int = a + b

val result = sum(10)(20)
println(s"Sum: $result")

// What happends if we try to call with only one parameter group?

val addTen = sum(10)

// What we get is a funcion that adds 10 to its argument !!

val finalResult = addTen(15)
println(s"Final Result: $finalResult")