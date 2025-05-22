error id: file://<WORKSPACE>/genrics/genric3.scala:`<none>`.
file://<WORKSPACE>/genrics/genric3.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 779
uri: file://<WORKSPACE>/genrics/genric3.scala
text:
```scala

/* 
Functions with Constraints in Scala (Upper Bounds with <:)

Sometimes, you want your generic type to support certain operations — like comparisons (>, <, etc.).
But not all types can do that by default.

[A <: SomeType]

A must be a subtype of SomeType or that type itself.

 import scala.compiletime.ops.boolean
 */ 


def maxOfTwo[A <: Ordered[A]](a: A, b: A): A = {
    if(a>b) a else b
}



case class Person(name: String)

case class PersonCmp(name: String) extends Ordered[PersonCmp] {
    def compare(that: PersonCmp): Int = this.name.compare(that.name) 
}  


object genricsThree {
    def main(args: Array[String]) = {
        println(
            maxOfTwo(5, 10)              
        )

        println(
            maxOfTwo("apple", "banana")
        )

        @@val p1 = Person("Niko")
        val p2 = Person("Oreo")

        // this will fail
        // println(
        //     maxOfTwo(p1, p2)
        // )


    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.