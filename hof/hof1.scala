object hofOne {
    def main(args: Array[String]) = {
        // map

        println(
            List(1 , 2, 3).map(_*2)
        )

        // flatMap
        println(
            List(1 , 2, 3) flatMap((x: Int) => List(x, x*2))
        )

        //filter
        println(
            List(1 , 2, 3, 4, 5) filter(x=> x%2==0)
        )


        // zip
        println(
            List(1, 2, 3).zip(List("a", "b", "c"))  
        )

        // zipAll -> Like zip, but fills with default values if lengths differ.

        println(
            List(1, 2).zipAll(List("a", "b", "c"), 0, "z")  
        )


        
    }
}