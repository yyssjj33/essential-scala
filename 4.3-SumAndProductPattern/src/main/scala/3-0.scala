//A has a B and C

case class A(b: B, c: C)

trait A {
  def b: B
  def c: C
}

// A is a B or C

sealed trait a
final case class B() extends A
final case class C() extends A