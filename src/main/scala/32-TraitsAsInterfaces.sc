// One simple example

trait HasTail:
  def startTail(): Unit
  def stopTail(): Unit

trait CanSpeak:
  def speak(): Unit

class Dog extends HasTail, CanSpeak:
  def startTail(): Unit = println("Tail is wagging")
  def stopTail(): Unit = println("Tail is stopped")
  def speak(): Unit = println("Woof")

val d = Dog()
d.speak()
d.startTail()
d.stopTail()

// Functions can ask for traits in parameters
def saySomething(speaker: CanSpeak): Unit = speaker.speak()

class Cat extends CanSpeak:
  def speak(): Unit = println("Meow")

saySomething(Dog())
saySomething(Cat())
