class Time:
    private var h = 12
    private var m = 0

    def hour: Int = h
    def hour_=(x: Int): Unit = h = x

    def minute: Int = m
    def minute_=(x: Int): Unit = m = x

    override def toString: String = s"Time: $h:$m"

@main
def getterStter(args: String*): Unit = 
    val t: Time = new Time

    println(t)
    println(t.hour)
    t.hour = 8
    println(t.hour)