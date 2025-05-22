object VariableTestFour {

    def greet(name: String) = s"hello $name"

    def randomNumber(): Int = scala.util.Random().nextInt()

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

        Can have multiple parameters, return types, recursion, etc.

        Lazily evaluated (executed only when called).
        */

        this.greet("Coco")
        println(this.randomNumber())


    }
}