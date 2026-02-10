// Immutable collection of key-value pairs

val states = Map(
  "AL" -> "Alabama",
  "AK" -> "Alaska",
)

// Read

states("AL")
states("foo")
states.get("AL")
states.getOrElse("AX", "not found")


// With for
val ucMap = for
  (k, v) <- states
yield
  (k, v.toUpperCase)

// Update

val states2 = states + ("CO" -> "Colorado")
val states3 = states2 ++ Map(
  "AR" -> "Arkansas",
  "AZ" -> "Arizona"
)

// Delete by key

val states4 = states3 - "AL"
val states5 = states4 -- Seq("AZ", "AR")

// map with Map

val states6 = states5.map((k, v) => (k, v.toUpperCase))

// More examples: https://alvinalexander.com/scala/scala-immutable-map-class-methods-examples-syntax
// Sorting maps: https://alvinalexander.com/scala/how-to-sort-map-in-scala-key-value-sortby-sortwith
// Choosing map implementation: https://alvinalexander.com/scala/how-to-choose-map-implementation-class-sorted-scala-cookbook


// I can use mutable maps

import scala.collection.mutable

val mmap = mutable.Map[String, Int]()

mmap += ("Patata" -> 15)

