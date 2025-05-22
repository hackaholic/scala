object genricsTwo {
    
    private def applyTwice[A](x: A, f: A => A): A = f(f(x)) 

    def main(args: Array[String]) = {
        println(applyTwice(3, (x: Int) =>  x*2))

        println(applyTwice(3,  _*3))
    }
}