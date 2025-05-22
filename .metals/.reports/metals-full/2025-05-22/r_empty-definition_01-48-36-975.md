error id: file://<WORKSPACE>/hof/hof4.scala:`<none>`.
file://<WORKSPACE>/hof/hof4.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 95
uri: file://<WORKSPACE>/hof/hof4.scala
text:
```scala
object hofThree {
    def main(args: Array[String]) = {
        val l: List[Int] = List(1, 2, 3@@, 4, 5)

        // drop(n) -> Drops the first n elements from a collection.
        println(
            l.drop(2)
        )

        // slice(from, until) -> Extracts a subrange of elements — from (inclusive) to until (exclusive).
        println(
            l.slice(1, 4)
        )

        // scanLeft ->  Like foldLeft, but returns all intermediate results, not just the final one.
        println(
            l.scanLeft(0)(_ + _)
        )

        // zipWithIndex -> Pairs each element with its index.
        println(
            l.zipWithIndex
        )

        // takeWhile -> Takes elements as long as the condition is true. Stops at first failure.
        println(
            l.takeWhile(_ < 3)
        )

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.