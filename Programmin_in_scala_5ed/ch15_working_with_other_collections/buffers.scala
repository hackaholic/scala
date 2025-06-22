import scala.collection.mutable

@main
def buffers(args: String*): Unit = 
    val array: mutable.ArrayBuffer[Int] = mutable.ArrayBuffer.empty
    val list: mutable.ListBuffer[String] =  mutable.ListBuffer[String]()

    // append +=
    array += 1

    // prepend +=:
    0 +=: array

    println(array)

    println(
        array ++ mutable.ArrayBuffer[Int](3, 4, 5)
    )

    // List Buffer

    list += "Niko"
    
    "Mini" +=: list
    println(list)