object flatMap {
    def main(args: Array[String]) = {
        val l = List(1 ,2, 3)
        val tuples = l.map(
            (x: Int) => List(x, x*10)
        )

        println(s"tupples: ${tuples}")

        val data = tuples.flatten
        println(s"data: ${data}")



        val xs = List(1, 2, 3)
        val ys = List("a", "b")

        val result = for {
        x <- xs
        y <- ys
        } yield (x, y)

        result.foreach(println)

        // rewrite above using flatMap
        val res = xs.flatMap(x=> ys.flatMap(y => List(x, y)))
        println(res)



    }
}