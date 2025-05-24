import CheckSumAccumulator.calculate

@main
def summer(args: String*) = 
    args.foreach(x => println(s"$x: ${calculate(x)}"))



// scala checksumAccumulator.scala summer.scala -- of love