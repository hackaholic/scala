error id: file://<WORKSPACE>/basic/variables/variable3.scala:`<none>`.
file://<WORKSPACE>/basic/variables/variable3.scala
empty definition using pc, found symbol in pc: `<none>`.
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 250
uri: file://<WORKSPACE>/basic/variables/variable3.scala
text:
```scala
object VariableTestThree {
    def main(args: Array[String]) = {
        val x = 1_000L   // val x: Long = 1000
        val y = 2.2D     // val y: Double = 2.2
        val z = 3.3F     // val z: Float = 3.3

        var a = BigInt(1_234_567_890_987_6@@54_321L)
        var b = BigDecimal(123_456.789)


        val name = "Bill"   // String: double quotes
        val c = 'a'         // Char: single quotes

        // s is used when using the variables directly in the string



        println(s"x: $x, y: $y, z: $z")

        // To embed arbitrary expressions inside a string, enclose them in curly braces:

        println(s"x+y: ${x+y}")

        // multiline strings
        val quote = """The essence of Scala:
               Fusion of functional and object-oriented
               programming in a typed setting."""


    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.