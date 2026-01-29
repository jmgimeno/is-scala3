// Traits can have concrete (implemented) behavior

trait HasTail:
  def startTail = "Tail started"
  def stopTail = "Tail stopped"
end HasTail

trait HasLegs:
  def walk = "Walking"
  def run = "Running"
  def standStill = "Standing still"
end HasLegs

trait CanSpeak:
  def speak: String
end CanSpeak

// In Scala 3 traits can have constructor parameters

trait Pet(name: String):
  def myName: String = s"My name is $name."

class Dog(name: String) extends Pet(name), HasTail, HasLegs, CanSpeak:
  def speak = "Woof"

  override def stopTail: String =
    "Tail stopped (reluctantly)"
end Dog

val d = Dog("Fido")
println(d.walk)
println(d.run)
println(d.standStill)
println(d.speak)
println(d.myName)



