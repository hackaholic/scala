@main
def hello(args: String*) = 
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5)

    val list3 = list1 ::: list2 

    println(list3)

    // prepends new element
    println(9 :: list1)  // :: cons operator

    val myList = 1 :: 2 :: 3 :: Nil


