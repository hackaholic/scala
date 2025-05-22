error id: file://<WORKSPACE>/first_class_functions/fcf1.scala:`<none>`.
file://<WORKSPACE>/first_class_functions/fcf1.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 34
uri: file://<WORKSPACE>/first_class_functions/fcf1.scala
text:
```scala
object firstClassFunction {


    @@def double(i: Int): Int = i*2

    def main(args: List[String]) = {
        val list = List(1, 2, 3)

        println(list.map(_ * 2))
        println(list.map(double(_)))
        print(list.map(x => double(x)))
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.