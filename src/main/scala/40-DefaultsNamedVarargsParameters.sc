// Parameters can have default values

class Connection:
  def makeConnection(
                      timeout: Int = 5_000,
                      protocol: String = "https"
                    ): Unit =
    println(f"timeout = $timeout%d, protocol = $protocol%s")
  end makeConnection
end Connection

val c = Connection()

c.makeConnection()
c.makeConnection(2_000)
c.makeConnection(3_000, "http")

// Named parameters

def truncate(string: String, length: Int): String =
  string.take(length)

truncate("freedom", 4)

truncate(
  string = "freedom",
  length = 4
)

// varargs parameters

def addAll(ints: Int*): Int =
  ints.sum

addAll()
addAll(1)
addAll(1, 2, 3, 4, 5)

// Use _* to expand a sequence into varargs

val xs = List(1, 2, 3)
// addAll(xs)
addAll(xs: _*)