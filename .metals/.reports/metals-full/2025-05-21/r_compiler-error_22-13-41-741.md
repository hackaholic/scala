error id: D908CB8FBF7868DEE00977D18F74903F
file://<WORKSPACE>/hof/hof2.scala
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.



action parameters:
offset: 293
uri: file://<WORKSPACE>/hof/hof2.scala
text:
```scala
object hofTwo {
    def main(args: Array[String]) = {
        val list: List[int] = List(1 ,2 ,3 ,4, 5)

        // fold  -> Combines elements using an operation, starting with an initial value.
        println(
            l.fold(0)(_ + _)
        )

        println(
            l.fold(10)((@@))
        )

    }
}
```


presentation compiler configuration:
Scala version: 3.7.0-bin-nonbootstrapped
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.7.0/scala3-library_3-3.7.0.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.16/scala-library-2.13.16.jar [exists ]
Options:





#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:101)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:479)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1