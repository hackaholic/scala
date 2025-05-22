object hofSix {
    def main(args: Array[String]) = {
        val l: List[Int] = List(1, 2, 3, 4, 5)
        val pet = List("Chika", "Suri", "Beru", "Batman", "Ginger")

        // sorted -> Sorts elements in natural order
        println(
            pet.sorted
        )

        // sortBy -> Sorts by a projection function.
        println(
            pet.sortBy(x => x.length)
        )

        // sortWith -> Lets you write a custom comparator function.
        println(
            pet.sortWith(_ > _)
        )

        // reverse -> Reverses the order of the list.
        println(
            l.reverse
        )

        // max / min

        println(
            l.min
        )

        println(
            l.max
        )

        // minBy / maxBy

        println(
            pet.minBy(_.length)
        )

        println(
            pet.maxBy(_.length)
        )

    }
}