// Functions and values defined at the top level of a Scala file

def sayHello(name: String): Unit =
  println(s"Hello, $name")

def containsSubstringIgnoreCase(s: String, substring: String): Boolean =
  s.toUpperCase.contains(substring.toUpperCase)

val lookFor = "al"

@main def anotherHelloWorld(name: String): Unit =
  sayHello(name)
  if containsSubstringIgnoreCase(name, lookFor) then
    println(s"Congratulations, your name contains '$lookFor'!")
  else
    println(s"Sorry, your name doesn’t contain '$lookFor'.")

