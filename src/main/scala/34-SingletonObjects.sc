// A singleton is a class with only one instance

object CashRegister:

  private var numOpens = 0
  private var numCloses = 0

  def open(): Unit =
    numOpens += 1

  def close(): Unit =
    numCloses += 1

  def getNumberOfOpens: Int = numOpens

  def getNumberOfCloses: Int = numCloses
end CashRegister

CashRegister.open()
CashRegister.close()
CashRegister.getNumberOfOpens
CashRegister.getNumberOfCloses

// They can be used as "utility classes" with only static methods

object StringUtils:

  def isNullOrEmpty(s: String): Boolean =
    if s==null || s.trim.equals("") then true else false

  def capitalizeAllWords(s: String): String =
    s.split(" ")
      .map(_.capitalize)
      .mkString(" ")
end StringUtils

StringUtils.isNullOrEmpty("")

// We can import some or all the public members

import StringUtils.*
capitalizeAllWords("big belly burger")