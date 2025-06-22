

@main
def hom(args: String*): Unit = 
    println(List(1, 2, 3).map(_ + 1))

    val words = List("Mini", "Kiki", "Raya", "Suri", "Dora", "Flow")

    // map
    println(s"word, len = ${words.map(x => (x, x.length))}")

    // flatMap
    println(words.flatMap(_.toList))
    println(List.range(1, 5).flatMap(i => List.range(1, i).map((i, _))))

    // filter
    println(List.range(1, 10).filter(_ % 2 == 0))

    // find
    println(List.range(1, 10).partition(_ % 2 == 0))

    // takeWhile
    println(List.range(1, 10).takeWhile(_ < 5))

    // dropWhile
    println(List.range(1, 10).dropWhile(_ < 5))

    // span
    println(List.range(1, 10).span(_ < 5))

    // forall
    println(words.forall(_.length ==4))

    // exists
    println(words.exists(_.startsWith("R")))

    // foldLeft
    println(
        words.foldLeft("")(_ + " " + _)
    )

    println(
        words.tail.foldLeft(words.head)(_ + "-> " + _)
    )

    // foldRight

    println(
        words.foldRight("")((x, y) => y + "<-" + x )
    )


    // sortWith

    println(
        words.sortWith(_ > _)
    )

    // sortby
    println(
        words.sortBy(_(0))
    )

    // apply
    println(
        words.apply(1)
    )

    println(List.apply(1 ,2 ,3))

    // List.range
    println(
        List.range(1, 5).map(_* 2)
    )

    println(
        List.range(1, 10, 2).map(_* 2)
    )

    println(
        List.range(10, 0, -1).map(_* 2)
    )

    // fill
    println(
        List.fill(5)('a')
    )

    println(
        List.fill(3)("Coco")
    )

    println(
        List.fill(2, 3)('b')
    )


    // tabulate, tabulate is designed to generate a list based on positions
    println(
        List.tabulate(5)(_*2)
    )

    println(
        List.tabulate(2,3)((i, j) => (i, j))
    )

    // concat
    println(
        List.concat(List(), List("a", "b"), List("c"))
    )

    // lazyzip

    val z = List(1,2,3).lazyZip(List(4, 5, 6))
    println(z)

    println(z.map(_ + _))



