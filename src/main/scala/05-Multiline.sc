// Multiline Strings in Scala

val address =
  """
    Alvin Alexander
    123 Main Street
    Talkeetna, AK 99676
"""

val a = 1
val b = "two"

val c =
  s"""
    $a
    $b
"""

val c2 =
  s"""
     |$a
     |$b
""".stripMargin.trim

val c3 =
  s"""
     #$a
     #$b
""".stripMargin('#').trim

case class Address(
                    street1: String,
                    street2: String,
                    city: String,
                    state: String,
                    zip: String
                  )

val a2 = Address(
  "P.O. Box 123",
  "",
  "Talkeetna",
  "AK",
  "99676"
)

val formattedAddress =
  s"""
     |${a2.street1}
     |${a2.street2}
     |${a2.city}, ${a2.state} ${a2.zip}
""".stripMargin.trim
