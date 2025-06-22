class SingletonOne private:
    def load: Unit = 
        println("Configuration loaded")


object SingletonOne:
    private val config = new SingletonOne
    def getInstance: SingletonOne = config


@main
def singleton_one(args: String*): Unit = 
    val ob1 = SingletonOne.getInstance
    val ob2 = SingletonOne.getInstance
    println(s"ob1 == ob2: ${ob1 == ob2}")