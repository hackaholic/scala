// Observer Pattern

trait Observer:
    def update(temp: Double): Unit

trait Subject:
    private var observers: List[Observer] = List[Observer]()
    def attach(ob: Observer):Unit = 
        observers = ob :: observers
    
    def detach(ob: Observer): Unit = 
        observers = observers.filterNot(_ == ob)

    def notify(temp: Double): Unit =
        observers.foreach(_.update(temp))

// concrete Subject
class WeatherStation extends Subject:
    private var temperature: Double = 0.0

    def setTemperature(temp: Double): Unit = 
        temperature = temp
        notify(temp)
    

class PhoneDisplay extends Observer:
    override def update(temp: Double): Unit = 
        println(s"[PhoneDisplay] Temperature Update to $temp")


class TVDisplay extends Observer:
    override def update(temp: Double): Unit = 
        println(s"[TVDisplay] Temperature Update to $temp")

class Laptop extends Observer:
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