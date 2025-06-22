import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
    def get: Int 
    def put(x: Int): Unit 
}

class BasicIntQueue extends IntQueue:
    private val buf = ArrayBuffer[Int]()   // ArrayBuffer.empty[Int]
    // You’re allowed to implement abstract methods silently because you have to — there’s nothing to override yet.
    def get: Int = buf.remove(0)
    def put(x: Int): Unit = buf.addOne(x)

trait Doubling extends IntQueue:
    abstract override def put(x: Int): Unit = super.put(x*2)


trait Incrementing extends IntQueue:
    abstract override def put(x: Int): Unit = super.put(x+1)

trait Filtering extends IntQueue:
    abstract override def put(x: Int): Unit = if x >= 0 then super.put(x)


// class MyQueue extends BasicIntQueue, Incrementing, Doubling

object stackableModification {
    def main(args: Array[String]): Unit =  {

        val b1 = new BasicIntQueue
        b1.put(10)
        b1.put(20)

        println(b1.get)
        println(b1.get)

        val queue = new BasicIntQueue with Incrementing with Filtering with Doubling

        queue.put(-1)
        queue.put(0)
        queue.put(1)
        println(queue.get)
        println(queue.get)

    }
}