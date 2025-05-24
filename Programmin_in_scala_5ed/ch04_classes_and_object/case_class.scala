case class Person(name: String, age: Int):
    def appendToName(suffix: String): Person = 
        new Person(s"$name $suffix", age)


object Person:
    def apply(name: String, age: Int): Person = 
        println("I am apply from compananion object")
        val capName = 
            if !name.isEmpty() then
                s"${name.charAt(0).toUpper}${name.slice(1, name.length)}"
            else
                throw IllegalArgumentException("Name cannot be empty")
        
        new Person(capName, age)


@main
def case_class(args: String*): Unit = 
    val p = Person("coco", 7)
    println(p.appendToName("mini"))
