
def sum(a: Int, b: Int, c: Int): Int = a+b+c

@main
def partialyApplied(args: String*) = 
    val a = sum(_, _, _) 

    println(a(1 ,2, 3))

    val b = sum(1, _, 3)
    println(b(2))
    println(b(5))

    