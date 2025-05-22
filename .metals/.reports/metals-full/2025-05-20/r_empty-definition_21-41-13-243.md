error id: file://<WORKSPACE>/basic/variables/variable4.scala:`<none>`.
file://<WORKSPACE>/basic/variables/variable4.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 414
uri: file://<WORKSPACE>/basic/variables/variable4.scala
text:
```scala
object Variable {

    def greet(name: String) = s"hello $name"

    def main(args: Array[String]) = {

        //  val- Immutable Variable
        val x = 10
        val y = 2 * x  // evaluated once, then fixed

        // x = 20 // throw error

        // var – Mutable Variable
        var count = 0

        count += 1
        
        /* 
         def - methods
         Re-evaluated every time you call it.

@@Can have multiple parameters, return types, recursion, etc.

Lazily evaluated (executed only when called).
        */



    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.