object SealedTraitTest extends App {
  /////////////////////////////////////
  val circle = new Circle(10)
  println(Draw(circle))

  divide(1, 0) match {
    case Finite(value) => println(s"It's finite: ${value}")
    case Infinite      => println(s"It's infinite")
  }
} 