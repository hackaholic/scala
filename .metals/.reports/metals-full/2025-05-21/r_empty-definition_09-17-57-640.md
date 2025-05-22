error id: file://<WORKSPACE>/strings/string1.scala:`<none>`.
file://<WORKSPACE>/strings/string1.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 693
uri: file://<WORKSPACE>/strings/string1.scala
text:
```scala
object testString {

    def reply(input: String): String = input match {
        case "hello" => "Hi!"
        case "bye"   => "See you!"
        case _       => "I don't understand"
        }

        println(reply("hello"))  // Output: Hi!

    def main(args: Array[String]) = {
        val input: String = scala.io.StdIn.readLine("Enter a name: ")
        
        // string matching using case

        input match {
            case "Raya" => println("you entered Raya")
            case "Kiki" =>  println("you entered Kiki")
            case "Dora" => println("you entered Dora")
            case _ => println("Unknown")
        }

        // return value

        println(reply("hello@@"))  // Output: Hi!


    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.