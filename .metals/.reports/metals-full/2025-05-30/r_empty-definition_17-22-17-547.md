error id: file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching2.scala:`<none>`.
file://<WORKSPACE>/Programmin_in_scala_5ed/ch13_pattern_matching/pattern_matching2.scala
empty definition using pc, found symbol in pc: `<none>`.
found definition using semanticdb; symbol scala/Predef.`???`().
empty definition using fallback
non-local guesses:

offset: 530
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



@main
def pattern_match_two(args: String*): Unit = 
    var  v = Var("x")
    var n = Num(1)

    val xs = 
    val res = xs match
        case BinOP("+", e @ Var("x"), v@@) => e
    



```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.