error id: file://<WORKSPACE>/first_class_functions/fcf2.scala:`<none>`.
file://<WORKSPACE>/first_class_functions/fcf2.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 136
uri: file://<WORKSPACE>/first_class_functions/fcf2.scala
text:
```scala
object firstClassFunction {
    def main(args: Array[String]) = {
        val add = (x: Int) => x + 1

        println(add(5))

        @@val test =  Array(1, 2 , 3).map((x: Int) => {
                println(s" I ma $x")
                x*2
            })

        println(
            List(1, 2 , 3).map((x: Int) => {
                println(s" I ma $x")
                x*2
            })
        )

        println(
           test.mkString(",")
        )
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.