object testString {

    def reply(input: String): String = input match {
        case "hello" => "Hi!"
        case "bye"   => "See you!"
        case _       => "I don't understand"
        }

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

        println(reply("hello"))  // Output: Hi!

    }
}