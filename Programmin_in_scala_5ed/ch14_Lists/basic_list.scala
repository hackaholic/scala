
def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match
        case List() => ys
        case x :: xs1 => x :: append(xs1, ys)

def rev[T](xs: List[T]): List[T] =
    xs match
        case List() => xs
        case x :: xs1 => rev(xs1) ::: List(x)
    

@main 
def basic_list(args: String*): Unit =

    // list literal

    val fruit: List[String] = List("apples", "oranges", "pears")
    val nums = List(1, 2, 3, 4)
    val empty: List[Nothing] = List()

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums1 = 1 :: 2 :: 3:: 4 :: Nil

    val empty1 = Nil

    try 
        println(Nil.head)
    catch {
        case e: NoSuchElementException => println(e)
    }

    // basic operation
    println(s"fruit.head: ${fruit.head}")
    println(s"fruit.tail: ${fruit.tail}")

    empty match
        case Nil => println("Empty List")
    
    if empty1.isEmpty then
        println("empty1 is empty")

    // List Pattern
    val List(a, b, c) = fruit
    println(s"a: $a, b:$b, c:$c")
    
    val k :: l :: rest = fruit
    println(s"k: $k, l: $l, rest: $rest")


    println(s"List(1, 2, 3) ::: List(4, 5, 6) => ${List(1, 2, 3) ::: List(4, 5, 6)}")


    println(append(fruit, fruit1))

    // length
    println(s"fruit.length: ${fruit.length}")

    // init
    println(s"fruit.init = ${fruit.init}")

    // last
    println(s"fruit.last = ${fruit.last}")

    println(s"abcde.reverse = ${"abcde".reverse}")

    println(s"rev(\"abcde\") = ${rev("abcde".split("").toList)}")