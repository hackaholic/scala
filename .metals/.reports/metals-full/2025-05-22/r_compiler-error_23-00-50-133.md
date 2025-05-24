error id: BE536617AA56EE9557FEC4FA363C58E0
file://<WORKSPACE>/Programmin_in_scala_5ed/ch03_next_step_in_scala/6.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.



action parameters:
offset: 97
uri: file://<WORKSPACE>/Programmin_in_scala_5ed/ch03_next_step_in_scala/6.scala
text:
```scala
import scala.compiletime.ops.double
@main
def mapYield = 
    val nums = List(1, 2, 3)

    val d@@for i <- nums yield i*2


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