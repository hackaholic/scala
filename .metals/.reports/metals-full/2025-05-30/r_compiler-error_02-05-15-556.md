error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching1.scala
### java.lang.IndexOutOfBoundsException: 2

occurred in the presentation compiler.



action parameters:
offset: 760
uri: file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching1.scala
text:
```scala
trait Expr
case class Var(name: String) extends Expr
case class Num(number: Double) extends Expr
case class UnOp(operator: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


def matchExpr(exp: Expr): Unit = 
    exp match
        case Var(x) => println(s"$exp, $x")
        case BinOp(op, left, right) => println(s"$exp -> $op, $left, $right") 
        case _ =>          // wildcard patten


// constant pattern

def describe(x: Any): Unit =
    x match
        case 5 => "five"
        case "hello" => "string hello"
        case Nil => "empty list"
        case _ => "Something else"

// varibale pattern
def variablePattern(x: Any): String = 
    x match
        case 0 => "zero"
        case BinOp("+", Num(1), e@@) => s"left Expr $e"
        case somethingElse => s"not zero $somethingElse"
        


    

@main
def pattern_match_one(args: String*): Unit = 
    val v = Var("x")
    val bin_op = BinOp("+", Num(1), v)

    println(bin_op)
    println(s"bin_op.right == Var(\"x\"): ${bin_op.right == v}")

    matchExpr(bin_op)

    bin_op match
        case BinOp(_, _, _) => println(s"$bin_op is binary operation")

    println(variablePattern(0))
    println(variablePattern("hello"))
    println(variablePattern(bin_op))






    
    
   

```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ]
Options:





#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.pc.InterCompletionType$.inferType(InferExpectedType.scala:98)
	dotty.tools.pc.InterCompletionType$.inferType(InferExpectedType.scala:66)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:523)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:122)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:191)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 2