@main
def hello() =
    val pair:(Int, String) = (2, "Simbha")
    println(s"${pair._1}, ${pair._2}")

    println(s"${pair(0)}, ${pair(1)}")
