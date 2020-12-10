object Question15 extends App {
  /*
  * Implemente uma função que ordena um array (de preferência usando a função
  anterior).
  * Resolver usando recursão e pattern matching.
  * */

  def solve(a: List[Int]): List[Int] = a match {
    case Nil => Nil
    case xs => xs.min :: solve(xs.diff(List(xs.min)))
  }

  val lis = List(1,3,2,3,5,10,8)
  println(solve(lis))
}
