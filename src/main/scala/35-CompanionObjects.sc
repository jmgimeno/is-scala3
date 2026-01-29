// A Companion object is an object with the same name as a class and defined in the same file
// And the class is called the companion class
// They can access each other's private members

class Circle(val radius: Double):

  import Circle.*

  def area: Double = calculateArea(radius)

object Circle:
  // a utility function
  private def calculateArea(radius: Double): Double = Math.PI * radius * radius

val c = Circle(3.3)
c.area

// Factory (apply) method in companion object

class Person private(val name: String):
  override def toString = name
end Person

object Person:
  def apply(theName: String): Option[Person] =
    if theName == null || theName.trim.equals("") then None
    else Some(new Person(theName))
end Person


val p1 = Person.apply("Alice")
val p2 = Person.apply("   ")

// But there is a nicer syntax

val p3 = Person("Bob")
val p4 = Person(null)



