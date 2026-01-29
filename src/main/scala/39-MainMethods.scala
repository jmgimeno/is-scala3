// Defines entry point of the Scala application

// Use scala-cli or scala command to run this file
// scala 39-MainMethods.scala

// scala run 39-MainMethods.scala --main-class helloWorld
@main def helloWorld(): Unit =
  println("Hello, world")

// Command-line parameters

// scala run 39-MainMethods.scala --main-class helloWorld2 -- patata
@main def helloWorld2(name: String): Unit =
  println(s"Hello, $name")

// scala run 39-MainMethods.scala --main-class helloWorld3 -- patata 42
@main def helloWorld3(name: String, age: Int): Unit =
  println(s"Hello, $name, who is $age years old")

// scala run 39-MainMethods.scala --main-class helloWorld4 -- patata poma pera
@main def helloWorld4(names: String*): Unit =
  names.foreach(name => println(s"Hello, $name"))