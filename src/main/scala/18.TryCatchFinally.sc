
// Used in a Java-like way

import java.io.*
import java.nio.file.{Files, Paths}

val filename = "/etc/passwd"
var stream: java.util.stream.Stream[String] = null

try
  stream = Files.lines(Paths.get(filename))
catch
  case ioe: IOException =>
    ioe.printStackTrace()
  case fnf: FileNotFoundException =>
    fnf.printStackTrace()
finally
  if stream != null then stream.close()
  
// As the body of a function as an EXPRESSION

def makeInt(s: String): Int =
  try
    s.toInt
  catch
    case e: NumberFormatException => 0
  finally
    println("finally!")

