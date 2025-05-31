error id: 878B711195D344203B464A0AB2974252
file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching2.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.



action parameters:
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


def variable_binding(xs"")

@main
def pattern_match_two(args: String*): Unit = 
    var  v = Var("x")
    var n = Num(1)

    val xs = BinOp("+", Var("x"), v)
    val res = xs match
        case BinOp("+", e @ Var("x"), v) => e
        case 
    
    println(res)
    



```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ]
Options:





#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.parsing.Scanners$Scanner.lookahead(Scanners.scala:1124)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause$$anonfun$1(Parsers.scala:3643)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosedWithCommas(Parsers.scala:625)
	dotty.tools.dotc.parsing.Parsers$Parser.inParensWithCommas(Parsers.scala:638)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause(Parsers.scala:3664)
	dotty.tools.dotc.parsing.Parsers$Parser.recur$5(Parsers.scala:3452)
	dotty.tools.dotc.parsing.Parsers$Parser.typeOrTermParamClauses(Parsers.scala:3467)
	dotty.tools.dotc.parsing.Parsers$Parser.defDefOrDcl(Parsers.scala:3983)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3876)
	dotty.tools.dotc.parsing.Parsers$Parser.topStatSeq(Parsers.scala:4609)
	dotty.tools.dotc.parsing.Parsers$Parser.topstats$1(Parsers.scala:4801)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit$$anonfun$1(Parsers.scala:4806)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:552)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit(Parsers.scala:4811)
	dotty.tools.dotc.parsing.Parsers$Parser.parse(Parsers.scala:209)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:32)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:510)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:51)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:367)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1324)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:360)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1$$anonfun$2(Run.scala:407)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1$$anonfun$adapted$1(Run.scala:407)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.Run.showProgress(Run.scala:469)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:407)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:419)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:419)
	dotty.tools.dotc.Run.compileSources(Run.scala:306)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:351)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:152)
```
#### Short summary: 

java.lang.AssertionError: assertion failed