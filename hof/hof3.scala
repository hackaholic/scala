object hofThree {
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

        // distinct -> Removes duplicates from a collection. Keeps only the first occurrence of each value.
        println(
            List(1, 2, 2, 3 , 4, 2).distinct
        )

        // take -> Takes the first n elements.
        println(
            fruits.take(2)
        )

        
    }
}