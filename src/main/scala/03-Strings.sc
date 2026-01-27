// simple

val name = "Alvin"

// Multiline

val fullAddress = """
Alvin
123 Main Street
Talkeetna, AK 99676
""""

// Common String methods

val s = "big belly burger"
s.length
s.capitalize
s.toUpperCase
s.take(3)
s.drop(4)
s.startsWith("b")
s.endsWith("er")
s.distinct
s.intersect("big")

// Higher-order functions (HOFs)

s.map(c => c.toUpper)
s.filter(c => !c.isSpaceChar)
s.dropWhile(c => c != 'e')

// String is a Seq[Char]

s(0)
for c <- s do println(c)

// More methods: https://alvinalexander.com/scala/scala-string-examples-collection-cheat-sheet