import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

def half(n: Int): Int = 
    if (n%2 == 0) n/2
    else throw new IllegalArgumentException("n must be Even")

@main
def exceptionHandling(args: String *): Unit =
    print("Enter a number: ")

    var n = 0
    try 
        n = scala.io.StdIn.readInt()
    catch
        case ex => {
            println(ex)
            val n = 20
        }
    
    try
        val nby2 = half(n)
    catch 
        case ex: IllegalArgumentException => println(ex)

    
    try {
        val f = new FileReader("input.txt")
    }
    catch {
        case ex: FileNotFoundException => println(ex)
        case ex: IOException => println(ex)
    }
    finally
       println("I am finally, I will get executed anyhow")


    



