import scala.collection.mutable

@main
def hello() =

    
    var pet: Set[String] = Set("Kiki", "Dora", "Chika")

    pet += "Ginger"   // pet = pet + "Giner"

    println(pet)

    println(s"contains Raya? : ${pet.contains("Raya")}")
    println(s"contains Dora? : ${pet.contains("Dora")}")

    val petTwo = mutable.Set("Mini", "Suri", "Flow")
    petTwo += "Shiro"

    println(petTwo)
