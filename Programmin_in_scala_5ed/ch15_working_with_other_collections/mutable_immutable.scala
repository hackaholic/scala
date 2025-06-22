import scala.collection.mutable
import scala.compiletime.ops.double

def longestWord(words: Array[String]): (String, Int) = 
    var word = words(0)
    var idx = 0
    for (w, i) <- words.zipWithIndex do
        if w.length > word.length then
            word = w
            idx = i
    
    (word, idx)

@main
def mutable_immutable(args: String*): Unit = 
    val ts = mutable.TreeSet[Int](1 ,2 ,3)
    val arr = ts to Array
    arr.foreach(println)

    val m = Map("i" -> 1, "ii" -> 2)
    println(m to mutable.Map)

    // tuples
    val (word, pos) = longestWord("The quick brown fox".split(" "))
    println(s"$word, $pos")

    // without parantheses both get evalute to same right expression
    val word1, pos1 = longestWord("The quick brown fox".split(" "))
    println(s"$word1, $pos1")
