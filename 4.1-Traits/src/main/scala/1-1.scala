trait Feline {
  def colour: String
  def sound: String
}

trait BigCat extends Feline {
  val sound = "roar"
}

case class Tiger(colour: String) extends BigCat 
case class Lion(colour: String, maneSize: Int) extends BigCat

case class Cat(colour: String, food: String) extends Feline {
  val sound = "meow"
}


