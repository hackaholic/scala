def sum(x: Int)(y: Int): Int = x+y

def first(x: Int): (Int => Int) = (y: Int) => x+y

def twice(f: Int => Int, x: Int): Int = f(f(x))

def myAssert(predicate: () => Boolean) = 
    if predicate() then
        println("Predicate hold true")

def byNameAssert(predicate: => Boolean) = 
    println(s"Predicate hold $predicate")

@main
def curryingTest(args: String*): Unit =
    val curriedSum = sum(2)(3)
    println(s"sum(2)(3): ${curriedSum}")

    val second = first(2)
    println(second(3))

    println(s"twice(_ + 1, 5):  ${twice(_+1, 5)}")

    myAssert(() => 7 > 4)

    byNameAssert(7 > 4)



