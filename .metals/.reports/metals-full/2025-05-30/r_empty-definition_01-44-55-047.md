error id: file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching1.scala:`<none>`.
file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching1.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 376
uri: file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching1.scala
text:
```scala
trait Expr
case class Var(name: String) extends Expr
case class Num(number: Double) extends Expr
case class UnOp(operator: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr




@main
def pattern_match_one(args: String*): Unit = 
    val v = Var("x")
    val bin_op = BinOp("+", Num(1), v)

    println(bin_op)
    println(s"bin_op.rig@@ht == Var(\"x\"): ${bin_op.right == v}")


    bin_op match
        case Var(x) => println($"$bin_op, $x")
        case BinOp(op, left, right) => println(s"$bin_op -> $op, $left, $right") 
        case _ =>   

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.