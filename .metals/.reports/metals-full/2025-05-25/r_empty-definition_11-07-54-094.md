error id: file://<WORKSPACE>/Programmin_in_scala_5ed/ch09_control_abstraction/currying.scala:`<none>`.
file://<WORKSPACE>/Programmin_in_scala_5ed/ch09_control_abstraction/currying.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 162
uri: file://<WORKSPACE>/Programmin_in_scala_5ed/ch09_control_abstraction/currying.scala
text:
```scala
def sum(x: Int)(y: Int): Int = x+y

def first(x: Int): (Int => Int) = (y: Int) => x+y

@main
def curryingTest(args: String*): Unit =
    val curriedSum = sum(2)(3@@)
    println(s"")

    val second = first(2, 3)
    println(second())

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.