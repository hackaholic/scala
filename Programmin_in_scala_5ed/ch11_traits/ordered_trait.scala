class Person(val name: String, val age: Int) extends Ordered[Person]:
    def compare(that: Person): Int = this.age - that.age

    override def toString: String = s"$name $age"

@main
def OrderedTest(args: String*): Unit = 
    val p1: Person = Person("Nova", 10)
    val p2: Person = Person("Shimba", 11)

    println(p1)
    println(p2)
    println(s"p1 > p2: ${p1 > p2}")

