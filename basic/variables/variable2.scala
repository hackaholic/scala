
/*
Type Inference

Scala has type inference, so you can omit the type if it's obvious.
 */

object VariableTestTwo {
  def main(args: Array[String]) = {
    var a = 10
    println(s"a: $a")

    a = 20
    println(s"a changed: $a")
  }
}
