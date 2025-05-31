
class Animal
trait HasLegs

trait Philosophical:
    def philosophize: String = "I consume memory, therefore I am!"


class Frog extends Animal, Philosophical, HasLegs:
    override def toString: String = "green"
    override def philosophize: String = s"It ain't easy being $this"

@main
def traitTest(args: String*): Unit = 
    val frog = new Frog
    println(frog)
    println(frog.philosophize)

