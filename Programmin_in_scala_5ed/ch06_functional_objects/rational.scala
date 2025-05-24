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
    
    def + (that: Rational): Rational = 
        Rational(
            this.numer * that.deno + that.numer * this.deno,
            this.deno * that.deno
        )
    
    def + (i: Int): Rational = 
        Rational(numer + i *deno, deno)
    
    def - (that: Rational): Rational = 
        Rational(
            this.numer * that.deno - that.numer * this.deno,
            this.deno * that.deno
        )
    
    def - (i: Int): Rational = 
        Rational(numer - i *deno, deno)

    def * (that: Rational): Rational = 
        Rational(
            this.numer * that.numer, this.deno * that.deno
        )
    
    def * (i: Int): Rational = 
        Rational(
            numer * i, deno
        )
    
    def / (that: Rational): Rational = 
        Rational(
            this.numer * that.deno, that.numer * this.deno
        )
    
    def / (i: Int): Rational = 
        Rational(
            numer, deno * i
        )


extension (x: Int) {
    def + (y: Rational): Rational = 
        Rational(x) + y
    
    def - (y: Rational): Rational = 
        Rational(x) - y
    
    def * (y: Rational): Rational = 
        Rational(x) * y
    
    def / (y: Rational): Rational = 
        Rational(x) / y

}


// currying style syntax
def test(title: String)(block: => Unit): Unit =
        println(s"\n==== $title ====")
        block
       
@main 
def rationalNumber(args: String*): Unit = 
    val r1 = new Rational(3, 2)       // Simplifies to 3/2
    val r2 = new Rational(9, 6)       // Simplifies to 3/2
    val r3 = new Rational(4, 5)       // 4/5
    val r4 = new Rational(7)          // 7/1 via auxiliary constructor
    val r5 = new Rational(2, 3)       // 2/3
    val r6 = new Rational(-8, -12)    // Simplifies to 2/3

    test("Basic Rational Instances") {
        println(s"r1: $r1")
        println(s"r2: $r2")
        println(s"r3: $r3")
        println(s"r4: $r4")
        println(s"r5: $r5")
        println(s"r6: $r6")
    }

    test("Addition of two rationals") {
        println(s"$r1 + $r3 = ${r1 + r3}")
        println(s"$r1 + $r2 = ${r1 + r2}") // Should be 3/2 + 3/2 = 3
    }

    test("Addition with integer") {
        println(s"$r1 + 2 = ${r1 + 2}") // 3/2 + 2 = 7/2
    }

    test("Subtraction of two rationals") {
        println(s"$r1 - $r3 = ${r1 - r3}")
    }

    test("Subtraction with integer") {
        println(s"$r1 - 1 = ${r1 - 1}") // 3/2 - 1 = 1/2
    }

    test("Multiplication of two rationals") {
        println(s"$r1 * $r3 = ${r1 * r3}") // 3/2 * 4/5 = 12/10 = 6/5
    }

    test("Multiplication with integer") {
        println(s"$r1 * 3 = ${r1 * 3}") // 3/2 * 3 = 9/2
    }

    test("Division of two rationals") {
        println(s"$r1 / $r3 = ${r1 / r3}") // 3/2 / 4/5 = 15/8
    }

    test("Division with integer") {
        println(s"$r1 / 2 = ${r1 / 2}") // 3/2 / 2 = 3/4
    }