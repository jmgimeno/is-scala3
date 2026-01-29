// A class with three auxiliary constructors

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

import CrustSize.*
import CrustType.*

class Pizza:

  var crustSize = Medium
  var crustType = Regular

  def this(cs: CrustSize, ct: CrustType) =
    this()
    this.crustSize = cs
    this.crustType = ct

  def this(crustSize: CrustSize) =
    this()
    this.crustSize = crustSize

  def this(crustType: CrustType) =
    this()
    this.crustType = crustType

  override def toString =
    s"A $crustSize pizza with a $crustType crust."

end Pizza

val p1 = Pizza()
val p2 = Pizza(Large, Thin)
val p3 = Pizza(crustSize = Large)
val p4 = Pizza(crustType = Thin)

// Constructor parameters with default values

class Socket(val timeout: Int = 10_000, val linger: Int = 5_000):
  override def toString = s"timeout: $timeout, linger: $linger"

val s1 = Socket(timeout = 3000, linger = 4000)
val s2 = Socket(linger = 4000, timeout = 3000)
val s3 = Socket(timeout = 3000)
val s4 = Socket(linger = 4000)