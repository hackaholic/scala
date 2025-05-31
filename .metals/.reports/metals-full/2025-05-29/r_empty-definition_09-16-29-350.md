error id: file://<WORKSPACE>/design_pattern/behavioral/observer_pattern/observer_pattern1.scala:`<none>`.
file://<WORKSPACE>/design_pattern/behavioral/observer_pattern/observer_pattern1.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 571
uri: file://<WORKSPACE>/design_pattern/behavioral/observer_pattern/observer_pattern1.scala
text:
```scala
// Observer Pattern

trait Observer:
    def update(temp: Float): Unit

trait Subject:
    private var observers: List[Observer] = List[Observer]()
    def attach(ob: Observer):Unit = 
        observers = ob :: observers
    
    def detach(ob: Observer): Unit = 
        observers = observers.filterNot(_ == ob)

    def notify: Unit =
        observers.foreach(_.update())

// concrete Subject
class WeatherStation extends Subject:
    private var temperature: Double = 0.0

    def setTemperature(temp: Double): Unit = 
        temperature = temp
        notify
    

@@class PhoneDisplay extends Observer:
    override def update(temp: Float): Unit = 
        println("[PhoneDisplay] Temperature Update to $temp")



```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.