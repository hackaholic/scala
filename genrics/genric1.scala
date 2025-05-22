
/* Genric
   Generics let you write type-agnostic code. You define functions, 
   classes, or traits that work with any type, not just specific ones like Int, String, etc.

*/


/* 

A is a type parameter.

You use square brackets [] to declare it.

The method accepts x: A and returns an A.

 */
def identity[A](x: A): A = x


// Multiple parameter
def swap[A, B](pair: (A, B)): (B, A) = {
    (pair._2, pair._1)
}

def getFirst[A](value: List[A]): A = value.head

object genricsOne {
    def main(args: Array[String]) = {
        println(identity[Int](1))

        println(identity("hello"))

        println(
            s"swap(hello, 1): ${swap("hello", 1)}"
        )

        println(
            getFirst(List("Flow", "Coco", "Mini", "Nova"))
        )
    }
}