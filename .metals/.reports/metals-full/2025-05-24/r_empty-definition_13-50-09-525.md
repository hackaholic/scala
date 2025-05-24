error id: file://<WORKSPACE>/Programmin_in_scala_5ed/ch06_functional_objects/rational.scala:`<none>`.
file://<WORKSPACE>/Programmin_in_scala_5ed/ch06_functional_objects/rational.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 479
uri: file://<WORKSPACE>/Programmin_in_scala_5ed/ch06_functional_objects/rational.scala
text:
```scala
class Rational(n: Int, d: Int):

    require(d != 0)

    private val g: Int = gcd(n.abs, d.abs)
    val numer = n/g
    val deno = d/g

    def this(n: Int) = this(n, 1)

    override def toString(): String = s"$numer/$deno"

    def gcd(a: Int, b: Int): Int = 
        if b == 0 then a else gcd(b, a%b)

    def add(that: Rational): Rational = 
        Rational(
            this.numer * that.deno + that.numer * this.deno,
            this.deno * that.deno
        )
    
    @@def +(that: Rational): Rational = 
        Rational(
            this.numer * that.deno + that.numer * this.deno,
            this.deno * that.deno
        )
    
    def -()

@main 
def rationalNumber(args: String*): Unit = 
    val r1 = new Rational(3, 2)
    val r2 = new Rational(9, 6)

    println(r1.add(r2))
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.