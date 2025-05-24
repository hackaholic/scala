
/* 

Regular class
name and age are constructor parameters only.
They are not accessible outside unless you declare them as val or var.

 */ 
class Dog(name: String, age: Int)

/* 
Case Class
name and age become public val fields (i.e., immutable and accessible).
*/
case class Cat(name: String, age: Int)



