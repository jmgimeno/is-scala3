// Sacala 3 blurs the line between funcions and methods (in Scala 2 there was a clearer distinction).
// - If inside a class/trait/object, we'll consider it a method
// - Otherwise, we'll consider it a function

// Scala 2 braces syntax
def multilineStringToList(s: String): Seq[String] = {
  val linesArray: Array[String] = s.split("\n")
  val linesSeq = linesArray.toSeq
  val linesTrimmed = linesSeq.map(_.trim)
  linesTrimmed.filter(_ != "")
}

// Scala 3 significant indentation syntax
def multilineStringToList2(s: String): Seq[String] =
  val linesArray: Array[String] = s.split("\n")
  val linesSeq = linesArray.toSeq
  val linesTrimmed = linesSeq.map(_.trim)
  linesTrimmed.filter(_ != "")

// Mode idiomatic

def multilineStringToList3(s: String): Seq[String] =
  s.split("\n")
    .toSeq
    .map(_.trim)
    .filter(_ != "")

val ms = """
one
two
three
"""

multilineStringToList3(ms)