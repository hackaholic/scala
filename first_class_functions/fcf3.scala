
// function returning function

/* 
Higher-Order Functions (HOFs)
💡 Definition:

    A higher-order function is a function that either:

        Takes one or more functions as parameters, OR

        Returns a function as its result
 */

def makeMultiplier(factor: Int): Int => Int = (x: Int) => x * factor

def outer(msg: String): () => Unit = {
    def inner(): Unit = println(s"Inner says $msg")
    inner
}

object firstClassFunctionThree {
    def main(args: Array[String]) = {

        val double = makeMultiplier(2)
        val triple = makeMultiplier(3)

        println(double(5))
        println(triple(5))

        val result = outer("Shiro")
        result()

    }
}