error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching2.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.



action parameters:
offset: 480
uri: file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching2.scala
text:
```scala


// variable binding
// @ symbol in pattern matching is used for variable binding — it lets you name the entire matched value


trait Expr
case class Var(name: String) extends Expr
case class Num(number: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


def variable_binding(xs: Any): Any = 
    xs match
        case BinOp("+", e @ Var("x"), v) => e
        case e @ BinOp(a@@, Var("x"), v) => e

@main
def pattern_match_two(args: String*): Unit = 
    var  v = Var("x")
    var n = Num(1)

    val xs = BinOp("+", Var("x"), v)
    val res = 
    
    println(res)
    



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

java.lang.IndexOutOfBoundsException: 0