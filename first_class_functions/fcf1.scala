

/*
In Scala, functions are values — you can assign them to variables, pass them as arguments, and return them from other functions. 
 */


object firstClassFunction {

    // Named Function
    def double(i: Int): Int = i*2

    def main(args: Array[String]) = {
        val list = List(1, 2, 3)

        println(list.map(_ * 2))
        println(list.map(double(_)))
        println(list.map(x => double(x)))

        // Anonymous Function

        val add = (a: Int, b: Int) => a+b

        println(s"add(2, 3): ${add(2,3)}")
    }
}