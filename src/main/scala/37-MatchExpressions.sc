// Match expressions are key in functional programming

enum CrustSize:
  case Small, Medium, Large

import CrustSize.*

val crustSize = Small

crustSize match
  case Small => println("small crust size")
  case Medium => println("medium crust size")
  case Large => println("large crust size")

val rez = crustSize match
  case Small => "small crust size"
  case Medium => "medium crust size"
  case Large => "large crust size"

// Handling a default case

def isTrue(a: Matchable): Boolean = a match
  case 0 => false
  case "0" => false
  case "" => false
  case false => false
  case _ => true

def isTrue2(a: Matchable): Boolean = a match
  case 0 | "0" | "" | false => false
  case _     => true

// It's common to use match expressions with lists

// Java-like way (imperative)

def sum1(list: List[Int]): Int =
  if list.isEmpty then
    0
  else
    list.head + sum1(list.tail)

// Functional way (using match expressions)

def sum2(list: List[Int]): Int = list match
  case Nil => 0
  case head :: tail => head + sum2(tail)

// More about match: https://alvinalexander.com/scala/how-to-use-pattern-matching-scala-match-case-expressions
