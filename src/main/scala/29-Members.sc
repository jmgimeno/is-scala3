// An OOP example

import scala.collection.mutable.ArrayBuffer

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Mushrooms, GreenPeppers, Olives

import CrustSize.*
import CrustType.*
import Topping.*

class Pizza(val crustSize: CrustSize = Medium, val crustType: CrustType = Regular):

  private val toppings = ArrayBuffer[Topping]()

  def addTopping(t: Topping): Unit =
    toppings += t

  def addToppings(ts: Topping*): Unit =
    toppings.appendAll(ts)

  def removeAllToppings(): Unit =
    toppings.clear()

  override def toString =
    s"""
       |A $crustSize pizza with a $crustType crust.
       |Toppings: ${this.toppings.mkString(", ")}""".stripMargin

end Pizza

val p1 = Pizza()
val p2 = Pizza(Medium, Regular)
val p3 = Pizza(crustType = Thin, crustSize = Large)

//p1.toppings

p1.addToppings(Cheese, Mushrooms)
println(p1)


