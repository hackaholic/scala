error id: file://<WORKSPACE>/hof/hof1.scala:`<none>`.
file://<WORKSPACE>/hof/hof1.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 195
uri: file://<WORKSPACE>/hof/hof1.scala
text:
```scala
object hofOne {
    def main(args: Array[String]) = {
        // map

        println(
            List(1 , 2, 3).map(_*2)
        )

        // flatMap
        println(
            List(1 , 2, 3@@) flatMap(List(_, _*2))
        )

        println(
            
        )
        
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.