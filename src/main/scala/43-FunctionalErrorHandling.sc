// In FP, we don't throw exceptions, instead we model errors as values
// using types like Option, Either, or Try.

def makeInt(s: String): Option[Int] =
  try
    Some(s.toInt)
  catch
    case _: NumberFormatException => None

makeInt("123")
makeInt("abc")

// We can use pattern matching to handle the result

makeInt("123") match
  case Some(value) => println(s"Parsed integer: $value")
  case None => println("Failed to parse integer")

// Or use for-comprehensions to chain operations

val result = for
  a <- makeInt("10")
  b <- makeInt("20")
  c <- makeInt("30")
yield a + b + c

result match
  case Some(sum) => println(s"Sum: $sum")
  case None => println("Failed to parse one of the integers")

// We can model the sama with Try to capture exceptions as values
// Useful when interacting with Java code that throws exceptions

import scala.util.{Try, Success, Failure}

def makeInt2(s: String): Try[Int] =
  try
    Success(s.toInt)
  catch
    case e: NumberFormatException => Failure(e)

makeInt2("456")
makeInt2("def")

makeInt2("456") match
  case Success(value) => println(s"Parsed integer: $value")
  case Failure(ex) => println(s"Failed to parse integer: ${ex.getMessage}")

// Chaining with for-comprehensions
  
val result2 = for
  a <- makeInt2("15")
  b <- makeInt2("25")
  c <- makeInt2("35")
yield a + b + c

result2 match
  case Success(sum) => println(s"Sum: $sum")
  case Failure(ex) => println(s"Failed to parse one of the integers: ${ex.getMessage}")

// Either can also be used to model errors with custom error types
// Left represents an error, Right represents a success

def makeInt3(s: String): Either[String, Int] =
  try
    Right(s.toInt)
  catch
    case _: NumberFormatException => Left(s"Cannot convert '$s' to Int")

makeInt3("789")
makeInt3("ghi")

makeInt3("789") match
  case Right(value) => println(s"Parsed integer: $value")
  case Left(errMsg) => println(s"Error: $errMsg")

// Chaining with for-comprehensions
  
val result3 = for
  a <- makeInt3("5")
  b <- makeInt3("15")
  c <- makeInt3("25")
yield a + b + c

result3 match
  case Right(sum) => println(s"Sum: $sum")
  case Left(errMsg) => println(s"Error: $errMsg")

