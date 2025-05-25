@main
def firstClassFunction(args: String*) =
    (1 to 5).foreach((x: Int) => println(x))

    (1 to 5).foreach(println(_))

