object hofTwo {
    def main(args: Array[String]) = {
        val l: List[Int] = List(1, 2, 3, 4, 5)

        // fold  -> Combines elements using an operation, starting with an initial value.
        println(
            l.fold(0)(_ + _)
        )

        println(
            l.fold(10)((x,y) => x+y)
        )

        // reduce

        println(
            l.reduce(_ + _)
        )

        // partition -> Splits the collection into a pair of collections: those that match a condition and those that don't.
        println(
            l.partition(_%2==0)
        )

        // find -> Returns the first element that matches a predicate (as an Option).
        println(
            l.find(_>2)
        )

        // exists -> Checks if any element satisfies a predicate. return true or false
        println(
            l.exists(_ == 2)
        )

    }
}