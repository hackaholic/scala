

// variable binding
// @ symbol in pattern matching is used for variable binding — it lets you name the entire matched value


trait Expr
case class Var(name: String) extends Expr
case class Num(number: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


def variable_binding(xs: Any): Any = 
    xs match
        case BinOp("+", e @ Var("x"), Num(1)) => e
        case e @ BinOp(a, Var("x"), Num(1)) => s"$e, $a"
        case _ => "Something Else"


def pattern_guards(xs: Any): Any =
    xs match
        case n: Int if n > 0 => s"$n is +ve" 
        case e @ BinOp("+", x, y) if x==y => BinOp("*", x, Num(2))
        case s: String if s.startsWith("C") => s"$s is here"
    

@main
def pattern_match_two(args: String*): Unit = 
    var  v = Var("x")
    var n = Num(1)

    val xs1 = BinOp("+", Var("x"), n)
    val xs2 = BinOp("-", Var("x"), n)
    
    println(variable_binding(xs1))
    println(variable_binding(xs2))

    val k = 29
    println(pattern_guards(k))

    val xs3 = BinOp("+", v, v)
    println(pattern_guards(xs3))

    val name = "Coco"
    println(pattern_guards(name))


