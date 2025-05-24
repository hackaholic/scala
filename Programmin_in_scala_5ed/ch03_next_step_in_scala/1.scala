@main
def greet(): Unit =
    val greetString = new Array[String](3)
    greetString(0) = "Hello"
    greetString(1) = ", "
    greetString(2) = "World"

    for i <- 0 to 2 do  // 0.to(2)
        print(greetString(i)) // greetString(i) is a shorthand for greetString.apply(i)
    println()

    greetString.foreach((x: String) => print(x))
    println()

    greetString.foreach(print(_))
    println()

    greetString.foreach(print)
    println()

    