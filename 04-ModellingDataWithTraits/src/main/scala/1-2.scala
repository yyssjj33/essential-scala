
trait Shape{
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

trait Rectangular extends Shape {
  def width: Double
  def height: Double
  def sides = 4
  def perimeter = 2*width +2*height
  def area = width*height
}

case class Rectangle(val width: Double, val height: Double) extends Rectangular 

case class Square(size: Double) extends Rectangular {
  val height = size
  val width = size
}

