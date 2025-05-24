@main 
def hello(args: String*): Unit =
    val msg = "Hello there!!"
    println(msg)
    println(s"max(4, 5): ${max(4, 5)}")   

def max(a: Int, b: Int) =
    if a>b then a else b