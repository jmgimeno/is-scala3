// Collection type with no duplicates

val set = Set(1, 2, 3, 3, 3)

// Empty set

val names: Set[String] = Set.empty

// "Adding" elements to a set with + and ++

val b = names + "Alvin"
val c = b ++ List("Joe", "Fred")

// Reading elements

val x = for e <- set yield e * 2

set(-1)
set(1)
set.contains(99)

// Create from range

val set2 = (1 to 10).toSet // Set[Int] = HashSet(5, 10, 1, 6, 9, 2, 7, 3, 8, 4)

// "Deleting" elements from a set with - and --

val a1 = Set(1, 2, 3, 4, 5, 6)
val b1 = a1 - 1
val c1 = b1 -- List(4, 5)

// Filtering
val a2 = (1 to 10).toSet
val b2 = a2.filter(_ > 3)
val c2 = b2.take(2)