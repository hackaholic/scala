error id: file://<WORKSPACE>/first_class_functions/map_flatmap.scala:`<none>`.
file://<WORKSPACE>/first_class_functions/map_flatmap.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 281
uri: file://<WORKSPACE>/first_class_functions/map_flatmap.scala
text:
```scala
object flatMap {
    def main(args: Array[String]) = {
        val l = List(1 ,2, 3)
        val tuples = l.map(
            (x: Int) => List(x, x*10)
        )

        println(s"tupples: ${tuples}")

        val data = tuples.flatten
        println(s"data: ${data}")



        @@val xs = List(1, 2, 3)
        val ys = List("a", "b")

        val result = for {
        x <- xs
        y <- ys
        } yield (x, y)

        // rewrite above using map and flat map

        


    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.