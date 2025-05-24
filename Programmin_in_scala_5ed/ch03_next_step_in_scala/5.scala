import scala.collection.mutable

@main
def hello() =
    val romanNumber = Map(
        1 -> "I",
        2 -> "II",
        3 -> "III",
        4 -> "IV",
        5 -> "V"
    )

    println(s"4 -> ${romanNumber(4)}")

    val mutableMap = mutable.Map[Int, Char]()
    mutableMap += (1 -> 'a')
    mutableMap += (2 -> 'b')
    mutableMap += (3 -> 'c')
    println(mutableMap)

