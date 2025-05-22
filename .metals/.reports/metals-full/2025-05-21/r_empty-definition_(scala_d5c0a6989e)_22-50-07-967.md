error id: file://<WORKSPACE>/hof/hof3.scala:`<none>`.
file://<WORKSPACE>/hof/hof3.scala
empty definition using pc, found symbol in pc: `<none>`.
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 866
uri: file://<WORKSPACE>/hof/hof3.scala
text:
```scala
object hofTwo {
    def main(args: Array[String]) = {
        val l: List[Int] = List(1, 2, 3, 4, 5)
        val fruits = List("apple", "banana", "apricot")

        // forall - > Checks if all elements satisfy a condition.
        println(
            l.forall(x => x > 10)
        )

        println(
            l.forall(x => x < 10)
        )

        // groupBy -> Groups elements based on a key function. return Map
        println(
            fruits.groupBy(_.head)
        )

        println(
            fruits.groupBy(_.length)
        )

        // collect -> Applies a partial function — filtering + mapping in one step.
        println(
            l.collect (
                x => x*2
            )
        )

        println(
            fruits.collect {
                case x if x.length > 5 => x
            }
        )


        // distinct -> Re@@moves duplicates from a collection.


        
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.