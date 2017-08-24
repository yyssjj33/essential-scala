object TraitTest extends App {
  /////////////////////////////////////
  val cat = new Cat("brown", "fish")
  println(cat)

  val lion = new Lion("yellow", 3)
  println(lion)
  ////////////////////////////////////
  val circle = new Circle(3.0)
  println(circle.area)

  val rect = new Rectangle(3.0, 4.0)
  println(rect.area)

  val user = new User("yyssjj33", "yj@qq.com")
  println(user.age)
}