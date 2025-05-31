trait Expr
case class Var(name: String) extends Expr
case class Num(number: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


def matchExpr(exp: Expr): Unit = 
    exp match
        case Var(x) => println(s"$exp, $x")
        case BinOp(op, left, right) => println(s"$exp -> $op, $left, $right") 
        case _ =>  println("Default Case")        // wildcard patten


// constant pattern

def describe(x: Any): String =
    x match
        case 5 => "five"
        case "hello" => "string hello"
        case Nil => "empty list"
        case _ => "Something else"

// varibale pattern
def variablePattern(x: Any): String = 
    x match
        case 0 => s"$x zero"
        case BinOp("+", Num(1), e) => s"$x => right Expr $e"
        case somethingElse => s"not zero $somethingElse"


// Sequence Pattern

def sequence_pattern(xs: Any): String = 
    xs match
        case List(0, _, _) => "found List 1st element 0"
        case List(1, _*) =>  "Found List 1st element 1"
        case _ => "Something Else"


// tuple pattern

def tuple_pattern(xs: Any): String = 
    xs match
        case (a , b, c) => s"$a: $b: $c"
        case _ => s"Something Else"


def typedPattern(xs: Any): String =
    xs match
        case i: Int => s"$i is an Integer"
        case s: String => s"$s is string"
        case m: Map[_,_] => s"$m is Map"
        case _ => s"Something Else"
    
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

    println(s"List(0, 1, 2): ${{sequence_pattern(List(0, 1, 2))}}")

    println(s"(1 ,2, 3) => ${tuple_pattern((1 ,2 ,3))}")


    println(s"1 -> ${typedPattern(10)}")
    println(s"hello -> ${typedPattern("hello")}")
    val m = Map(1->"a", 2->"b")
    println(s"$m: ${typedPattern(m)}")








    
    
   
