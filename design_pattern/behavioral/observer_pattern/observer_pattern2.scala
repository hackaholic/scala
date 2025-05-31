// Observer Pattern using generic

trait Observer[T]:
    def update(data: T): Unit

trait Subject[O <:Observer[T], T]:
    private var observers: List[O] = List[O]()
    def attach(ob: O):Unit = 
        observers = ob :: observers
    
    def detach(ob: O): Unit = 
        observers = observers.filterNot(_ == ob)

    def notify(data: T): Unit =
        observers.foreach(_.update(data))

// concrete Subject
class WeatherStation extends Subject[Observer[Double], Double]:
    private var temperature: Double = 0.0

    def setTemperature(temp: Double): Unit = 
        temperature = temp
        notify(temperature)
    

class PhoneDisplay extends Observer[Double]:
    override def update(temp: Double): Unit = 
        println(s"[PhoneDisplay] Temperature Update to $temp")


class TVDisplay extends Observer[Double]:
    override def update(temp: Double): Unit = 
        println(s"[TVDisplay] Temperature Update to $temp")

class Laptop extends Observer[Double]:
    override def update(temp: Double): Unit = 
        println(s"[Laptop] Temperature Update to $temp")


@main
def runObserverPattern(args: String*): Unit = 
    val ws = new WeatherStation
    val tv = new TVDisplay
    val phone = new PhoneDisplay
    val laptop = new Laptop

    ws.attach(tv)
    ws.attach(phone)
    ws.attach(laptop)

    ws.setTemperature(10.34)
    ws.setTemperature(12.29)

    ws.detach(tv)

    ws.setTemperature(16.20)