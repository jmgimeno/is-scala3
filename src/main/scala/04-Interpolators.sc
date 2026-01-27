// s is the main string interpolator in Scala

val fname = "Alvin"
val lname = "Alexander"
val fullName = fname + " " + lname     // don't do it

val fullName2 = s"$fname $lname"

val rez = s"${1 + 1}"

// example:
case class Person(firstName: String, lastName: String)
val p = Person("Alvin", "Alexander")

val fullName3 = s"${p.firstName} ${p.lastName}"

// f is the formatted string interpolator in Scala

val name = "Fred"
val age = 33
val weight = 200.00

s"$name is $age years old, and weighs $weight pounds."

f"$name is $age years old, and weighs $weight%.2f pounds."
