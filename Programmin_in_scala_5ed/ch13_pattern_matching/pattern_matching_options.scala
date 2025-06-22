
def safeDivide(a: Int, b: Int): Option[Int] =
    if b == 0 then
        None
    else
        Some(a/b)

def extractSome(value: Option[Any]): Any =
    (value: @unchecked) match
        case Some(x) => x
        case None => None

@main
def helloThere(args: String*): Unit =
    val a = safeDivide(10, 2)
    val b = safeDivide(10, 0)

    // extracting value using pattern matching
    println(extractSome(a))
    println(extractSome(b))

    // extract value using getOrElse
    println(a.getOrElse("Divide By zero"))
    println(b.getOrElse("Divide by zero"))

    val maybeA: Option[Int] = Some(20)
    val maybeB: Option[Int] = Some(4)

    maybeA.foreach(println)

    //map is not used to extract, but to transform the value while keeping it safely inside Option.
    println(maybeB.map(x => x*2))    // Some(8)

    val maybeName: Option[String] = Some("Shubham")
    val upper = maybeName.map(_.toUpperCase)  //  Some("SHUBHAM")
    println(maybeName.map(_.toUpperCase).getOrElse("Anonymous"))


    










