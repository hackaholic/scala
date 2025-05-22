
/* 
Functions with Constraints in Scala (Upper Bounds with <:)

Sometimes, you want your generic type to support certain operations — like comparisons (>, <, etc.).
But not all types can do that by default.

[A <: SomeType]

A must be a subtype of SomeType or that type itself.

 */ 

abstract class Animal {
 def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name: String = "Lion"
}

class PetContainer[P <: Pet](p: P) {
    def pet: P = p
}


object genricsThree {
    def main(args: Array[String]) = {
       val dogContainer = new PetContainer[Dog](new Dog)
       val catContainer = new PetContainer[Cat](new Cat)

       // // this would not compile
       // val lionContainer = new PetContainer[Lion](new Lion)

    }
}