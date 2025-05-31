
case class PosInt(n: Int):
    require(n > 0)


case class PosIntOne(n: Int):
    require(n > 0)

    def +(x: Int): Int = 
        n+x

case class PosIntTwo(n: Int):
    require( n > 0)
    export n.*

    def +(pos: PosIntTwo): PosIntTwo =
        PosIntTwo(n + pos.n) 


@main
def exportTest(args: String*): Unit = 
    val p1 = PosInt(10)
    val p2 = PosInt(5)
    try 
        val p3 = PosInt(-3)
    catch {
        case e: IllegalArgumentException => println(s"[Error]: $e")
    }

    //val p4 = p1 + p2

    val p5 = PosIntOne(5)
    println(s"p5 + 1 => ${p5 + 1}")

    val p6 = PosIntTwo(29)
    
    println(s"p6 + 1 => ${p6 + 1}")

    val p7 = PosIntTwo(3)

    println(s"p6 + p7 => ${p6 + p7}")




