abstract class A:
    def demo: String = " I am from Class A"

class B extends A:
    override def demo: String = "I am from Class B"

class C extends A:
    final override def demo: String = " I am from Class C" 

def invoke(e: A): String = s"${e.demo}, type=${e.getClass.getSimpleName}"

@main
def helloThere(args: String*): Unit = 
    println(invoke(new B))
    println(invoke(new C))



