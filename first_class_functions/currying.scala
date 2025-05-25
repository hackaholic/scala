
/* 
What is Currying?

Currying is the process of transforming a function that takes multiple arguments into a series of functions, each taking one argument at a time.

 */

def add(a: Int)(b: Int): Int = a+b


object firstClassFunctionFour {
    def main(args: Array[String]): Unit = {
        val add2 = add(2)   // partial applied with x=2
        println(add2(5))

        // apply fully
        println(add(2)(5))

    }
}