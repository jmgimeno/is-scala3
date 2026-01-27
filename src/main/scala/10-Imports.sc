// Implicitly imported:
// java.lang.*
// scala.*
// scala.Predef.*

// Everything else must be imported
// - Mutable collections
// - Third-party libraries

import scala.io.Source

// Manual closing of Source (not recommended)

 val src = Source.fromFile("/usr/share/dict/words")
 try {
   src.getLines().take(10).foreach(println)
 } finally {
   src.close()
 }

// Better: automatic resource management with scala.util.Using

import scala.util.Using
import scala.util.{Success, Failure}

Using(Source.fromFile("/usr/share/dict/words")) { src =>
  src.getLines().take(10).foreach(println)
} match {
  case Success(_) => // done
  case Failure(ex) =>
    Console.err.println(s"Error reading file: ${ex.getMessage}")
}

