case class Person(name: String)


def getTypeAsString(x: Any) = x match {
    case s: String => s"'$s' is a String"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[_] => "List"
    case _ => "Unknown"
}


object controlStructureFour {
    def main(args: Array[String]) = {

        val x = 2
        x match {
            case 1 => println("one")
            case 2 => println("two")
            case 3 => println("three")
            case _ => println("other")
        }


        // match on Type:
        println(s"${getTypeAsString("hello")}")


        val p = Person("coco")

        p match {
            case Person(name) if name == "mini" => println(s"I am $name")
            case Person(name) if name == "coco" => println(s"I am $name")
            case  _ => println(" i am other")
        }



    }
}