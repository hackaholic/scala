object controlStructureTwo{
    def main(args: Array[String]) = {
        val ints = List(1, 2, 3)

        for(x <- ints) {
            println(x)
        }

        // gaurds
        for(x <- ints if x>1 if x<3) {
            println(x)
        }

        // nested loop
        for {
                i <- 1 to 3
                j <- 'a' to 'c'
                if i == 2
                if j == 'b'
            } {
                println(s"i = $i, j = $j")   // prints: "i = 2, j = b"
                }
            
        
        for {
                i <- 1 to 3
                j <- 'a' to 'c'
                if i == 2 ||j == 'b'
            } {
                println(s"i = $i, j = $j")   // prints: "i = 2, j = b"
                }
    }
}
