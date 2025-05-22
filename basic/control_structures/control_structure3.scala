object controlStructureThree {
    def main(args: Array[String]) = {
        // for expressions

        val ints: Array[Int] = Array(1,2,3,4 ,5)

        val doubles = for(x <- ints) yield x*2
        //  List[Int] = List(2, 4, 6, 8, 10)

        for (d <- doubles)
            println(d)

    }
}