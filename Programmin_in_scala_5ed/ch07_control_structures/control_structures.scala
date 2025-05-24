import scala.compiletime.ops.double
@main
def controlStructures(args: String*): Unit = 

    var fileName = "default.txt"
    
    // if 
    if !args.isEmpty then
        fileName = args(0)
    
    // conditional initialization
    fileName = 
        if !args.isEmpty then args(0)
        else "default.txt"
    

    // while loop
    var a = 0
    while (a<10) {
        a += 1
    }

    a = 0
    while a < 10 do
        a += 1
    
    // no do-while in scala
    while 
        println("Enter some text: ")
        val line = scala.io.StdIn.readLine()
        line != ""
    do () // A Unit value ()


    // for Expression
    val files =  (new java.io.File(".")).listFiles()

    for file <- files do
        println(file)
    
    println("1 to 4")
    for i <- 1 to 4 do
        print(s"$i ")
    
    println("1 until 4")
    for i <- 1 until 4 do
        print(s"$i ")

    // nested loop
    for file <- files 
        if file.getName.endsWith(".scala")
            lines = scala.io.Source.fromFile(file).getLines()
            line <- lines do
                if !line.isEmpty then
                    println(line.trim)
    
    for i <- 1 to 3
        if i == 2
        j <- 1 until 3 
        do 
            println(j)

    
    // for producing new collection

    println(
        (for file <- files 
            if file.getName.endsWith(".scala")
            yield file).toList
    )



