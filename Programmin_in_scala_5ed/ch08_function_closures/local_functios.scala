


@main
def function(args: String*): Unit = 
    def getAllFiles(dir: String ="."): Array[java.io.File] = 
        for file <- java.io.File(dir).listFiles 
            if file.isFile
                yield file

    println(getAllFiles("/home/kumar").length)


