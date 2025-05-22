/*
By contrast, Scala has two types of variables:

    val creates an immutable variable (like final in Java)
    var creates a mutable variable

    | Type      | Description      | Example           |
| --------- | ---------------- | ----------------- |
| `Int`     | Integer          | `val x: Int = 5`  |
| `Double`  | Decimal number   | `val y = 3.14`    |
| `Boolean` | true or false    | `val b = true`    |
| `String`  | Text             | `val s = "Scala"` |
| `Char`    | Single character | `val c = 'A'`     |


 */

object variableTest {
    def main(args: Array[String]) = {
        val a:Int  = 10
        println(a)
    }
}