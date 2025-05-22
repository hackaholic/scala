error id: file://<WORKSPACE>/hof/hof5.scala:`<none>`.
file://<WORKSPACE>/hof/hof5.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 814
uri: file://<WORKSPACE>/hof/hof5.scala
text:
```scala
object hofFive {
    def main(args: Array[String]) = {
        val l: List[Int] = List(1, 2, 3, 4, 5)

        // dropWhile ->  Drops elements from the start as long as the condition holds. Stops at first failure.
        println(
            l.dropWhile(_ < 3)
        )

        // grouped -> Groups elements into fixed-size batches (returns an Iterator).
        println(
            l.grouped(2).toList
        )

        // sliding -> Creates overlapping sliding windows (returns an Iterator).
        println(
            l.sliding(2).toList
        )

        println(
            l.sliding(2, 2).toList   // using step
        )

        // updated -> Returns a new collection with an element replaced at a specific index.
        println(
            l.updated(0, 99)
        )

        // mkString -> Cre@@ates a single string from collection elements, with optional separators.
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.