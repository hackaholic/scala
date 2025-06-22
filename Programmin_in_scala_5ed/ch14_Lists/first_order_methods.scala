import scala.compiletime.ops.double
@main
def first_order_method(args: String*): Unit = 

    val pet = List("Nova", "Ciri", "Shiro", "Robin", "Dante")

    println(s"pet: $pet")

    // drop
    println(s"pet.drop(2): ${pet.drop(2)}")

    // take
    println(s"pet.take(2): ${pet.take(2)}")

    // splitAt
    println(s"pet.splitAt(3): ${pet.splitAt(3)}")

    // indices
    println(s"pet.indices : ${pet.indices}")

    val nested: List[List[Int]] = List(List(1,2), List(3), List(4,5))
    println(s"nested list: $nested")

    // flatten
    println(s"nested.flatten: ${nested.flatten}")

    println(pet.map(_.toList).flatten)

    // zip
    val zipped = pet.indices.zip(pet)
    println(s"pet.indices.zip(pet): $zipped")

    // unzip
    println(s"pet.unzip: ${zipped.unzip}")

    // to String
    println(s"pet.toString: ${pet.toString}")

    // mkstring
    println(s"pet.mkString(\"[\", \",\", \"]\"): ${pet.mkString("[", ",", "]")}")

    val buf = new StringBuilder
    println("abcde".addString(buf, "(", ";", ")"))

    val arr = pet.toArray

    var arr2 = new Array[String](pet.length)
    pet.copyToArray(arr2)
    println(s"arr2: ${arr2.toList}")

    // iterator
    val it = pet.iterator
    while it.hasNext do
        println(it.next)
    




