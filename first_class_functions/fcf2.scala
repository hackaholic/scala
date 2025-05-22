object firstClassFunctionTwo {
    def main(args: Array[String]) = {
        val add = (x: Int) => x + 1

        println(add(5))

        

        println(
            List(1, 2 , 3).map((x: Int) => {
                println(s" I ma $x")
                x*2
            })
        )

        // Java arrays don’t override toString(), so you get the object's memory address representation.

        val test =  Array(1, 2 , 3).map((x: Int) => {
                println(s" I ma $x")
                x*2
            })

        println(
           test.mkString(",")
        )
    }
}