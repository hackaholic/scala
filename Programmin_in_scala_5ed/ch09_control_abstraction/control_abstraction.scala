import scala.compiletime.ops.boolean

object FileMatcherOne:
    private def filesHere(path: String): List[java.io.File] = (new java.io.File(path)).listFiles.toList

    def filesEnding(path: String, query: String) =
        for file <- filesHere(path)
            if file.getName.endsWith(query)
             yield file
    
        
    def filesContaining(path: String, query: String) =
        for file <- filesHere(path)
            if file.getName.contains(query)
                yield file
    
    def fileRegex(path: String, query: String) =
        for file <- filesHere(path)
            if file.getName.matches(query)
                yield file
    

object FileMatcherTwo:
    private def filesHere(path: String): List[java.io.File] = (new java.io.File(path)).listFiles.toList

    def filesMatching(path: String, query: String, matcher:(String, String) => Boolean) =
        for file <- filesHere(path)
            if matcher(file.getName, query)
                yield file
             


@main
def helloMain(args: String*): Unit = 
    println(FileMatcherOne.filesEnding("/home/kumar", ".sh"))

    println(FileMatcherTwo.filesMatching("/home/kumar", "test", (fileName: String, query: String) => fileName.startsWith(query)))

    // more concise 
    println(FileMatcherTwo.filesMatching("/home/kumar", "hello", _.contains(_)))