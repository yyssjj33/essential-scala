sealed trait Color {
  def r: Double
  def g: Double
  def b: Double

  def isLight: Boolean = (r+g+b)/3.0 > 0.5
  def isDark = !isLight
}

final case object Red extends Color {
  val r = 1.0
  val g = 0.0
  val b = 0.0
}

final case object Yellow extends Color {
  val r = 1.0
  val g = 1.0
  val b = 0.0
}

final case object Pink extends Color {
  val r = 1.0
  val g = 0.0
  val b = 1.0
}

final case class CustomColor(
  r: Double,
  g: Double,
  b: Double) extends Color