import scala.collection.mutable
import scala.compiletime.ops.double

@main
def sets_map(args: String*): Unit =

    // set 
    val s1 = mutable.Set[Int](1, 2, 3, 4)
    val s2 = mutable.Set(3, 4, 5, 6)

    // ++ collections
    s1 ++= Set(7, 8, 9)
    println(s1)

    println(
        s"2 in mutaSet: ${s1.contains(2)}"
    )

    s1 += 4
    println(s1)

    0 ++: s1
    println(s1)


    // map
    val m1 = mutable.Map[String, Int]("a" -> 1, "b" -> 2)
    println(m1)

    for x <- m1 do
        println(x)
    
    for (x,y) <- m1 do
        println(s"$x, $y")
    
    // TreeSet

    val tset  = mutable.TreeSet[Int](1, 3, 3)

    println(tset)

    // TreeMap

    val tmap = mutable.TreeMap[String, Int]("a" -> 1, "b"-> 2, "c" -> 3)
    println(tmap)                                          