trait Logger(level: String):
    def log(msg: String): Unit =
        println(s"$level: $msg")


// trait TimestampLogger extends Logger("INFO") // ❌ invalid, traits are not allowed to call constructors
// Other traits cannot call the trait constructor — only classes can.
trait TimestampLogger extends Logger:
    abstract override def log(msg: String): Unit =
        val now = java.time.Instant.now
        super.log(s"$now $msg")

trait PrefixLogger(prefix: String) extends Logger:
    abstract override def log(msg: String): Unit =
        super.log(s"$prefix $msg")


class Service extends Logger("INFO")

@main
def runLogger(): Unit =
    val logger = new Service with PrefixLogger(">>>") with TimestampLogger
    logger.log("Logger is started....") 

