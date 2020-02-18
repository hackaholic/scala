
class Test(a: String, b: Int)

class Test2(var a: String, var b: Int)

case class Test3(a: String, b: Int)

object Hello extends App{
  val k = new Test("I am Test", 1)
  //println(k.b)  will throw error because by default member of a class is private

  val x = new Test2("I am Test2", 2)
  println(x.a)
  x.a = "I am changed"
  println(x.a)

  val y = Test3("I am Test3, case class", 3) 
  //no new keyword because case classes have an apply method by default which takes care of object construction.
  println(y.a) // by default member of case clasee is public
  
  // y.a = "I am change" will through error as member of case class is immutable by default
}
