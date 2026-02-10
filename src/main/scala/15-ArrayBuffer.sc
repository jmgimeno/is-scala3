import scala.collection.mutable.ArrayBuffer

// Mutable and indexed collection

// We won't use it much, cause mutable

val fruits = ArrayBuffer[String]()
val ints = ArrayBuffer[Int]()

val fruits2 = ArrayBuffer("apple", "banana", "cherry")
val ints2 = ArrayBuffer(1, 2, 3)

fruits(0)
fruits(1)

for i <- ints do println(i)

// Updating with += and ++=

val nums = ArrayBuffer(1, 2, 3)
nums += 4
nums ++= List(7, 8)

// Updating elements by index
val a = (1 to 4).toBuffer
a(2) = 50
a.update(0, 10)
a.update(3, 40)

a

// Can use methods like:
// append, appendAll,
// insert, insertAll
// prepend, prependAll

val b = ArrayBuffer(1, 2, 3)
b.append(4)
b.appendAll(Seq(5, 6))

val c = ArrayBuffer(9, 10)
c.insert(0, 8)
c.insertAll(0, Vector(6, 7))
c.prepend(5)
c.prependAll(Seq(1, 2, 3, 4))

// Updating in place

val d = ArrayBuffer.tabulate(10)(i => i + 1)
d.dropInPlace(1)
d.dropRightInPlace(1)
d.dropWhileInPlace(_ < 4)
d.filterInPlace(_ > 4)
d.mapInPlace(_ * 10)
d.map(_ * 10)
d.takeInPlace(4)
d.takeRightInPlace(3)
d.takeWhileInPlace(_ < 80)

// Deleting elements with -= and --=

val e = ArrayBuffer.range('a', 'h')
e -= 'a'
e --= Seq('b', 'c')

// convert to an immutable collection

e.toList
e.toVector

// Remove

val f = ArrayBuffer.range('a', 'h')
f.remove(0)
f.remove(2, 3)

// Clear

val g = ArrayBuffer.range('a', 'h')
g.clear()

// More examples: https://alvinalexander.com/scala/arraybuffer-class-methods-syntax-examples-reference


