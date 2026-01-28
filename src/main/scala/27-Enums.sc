// Finite set of named values

// In Scala 3:
// - can be parameterized
// - can have members (fields and methods)

enum Directions:
  case North, South, East, West

enum Bool:
  case True, False

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Mushrooms, GreenPeppers, Olives

import CrustSize.*
import CrustType.*
import Topping.*

case class Pizza(
                  crustSize: CrustSize,
                  crustType: CrustType,
                  toppings: Seq[Topping]
                )

val p1 = Pizza(Small, Thin, Seq(Cheese))
val p2 = p1.copy(
  toppings = p1.toppings ++ Seq(Mushrooms, Olives)
)
val p3 = p2.copy(crustSize = Large)

// Enums can be parameterized

enum HttpResponse(val code: Int):
  case Ok extends HttpResponse(200)
  case MovedPermanently extends HttpResponse(301)
  case InternalServerError extends HttpResponse(500)

import HttpResponse.*

Ok.code
MovedPermanently.code
InternalServerError.code

// Another example

// enums can be parametrized
enum Suit(val symbol: String):
  case Hearts extends Suit("♥")
  case Diamonds extends Suit("♦")
  case Clubs extends Suit("♣")
  case Spades extends Suit("♠")

enum Rank(val value: Int):
  case Two extends Rank(2)
  case Three extends Rank(3)
  case Four extends Rank(4)
  case Five extends Rank(5)
  case Six extends Rank(6)
  case Seven extends Rank(7)
  case Eight extends Rank(8)
  case Nine extends Rank(9)
  case Ten extends Rank(10)
  case Jack extends Rank(11)
  case Queen extends Rank(12)
  case King extends Rank(13)
  case Ace extends Rank(14)

case class Card(rank: Rank, suit: Suit):
  override def toString =
    s"$rank of $suit"

val deckOfCards: Seq[Card] = for
  rank <- Rank.values.toSeq
  suit <- Suit.values.toSeq
yield
  Card(rank, suit)

import scala.util.Random

val d2 = Random.shuffle(deckOfCards)

// Enums can have methods

enum Planet(mass: Double, radius: Double):
  private final val G = 6.67300E-11

  def surfaceGravity = G * mass / (radius * radius)

  def surfaceWeight(otherMass: Double) = otherMass * surfaceGravity

  case Mercury extends Planet(3.303e+23, 2.4397e6)
  case Venus extends Planet(4.869e+24, 6.0518e6)
  case Earth extends Planet(5.976e+24, 6.37814e6)
  case Mars extends Planet(6.421e+23, 3.3972e6)
  case Jupiter extends Planet(1.9e+27, 7.1492e7)
  case Saturn extends Planet(5.688e+26, 6.0268e7)
  case Uranus extends Planet(8.686e+25, 2.5559e7)
  case Neptune extends Planet(1.024e+26, 2.4746e7)
end Planet


