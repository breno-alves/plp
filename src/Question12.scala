object Question12 extends App {
  /*
   *
   * Implemente uma função que recebe um array e o retorna invertido. Resolver usando
      recursão de cauda e pattern matching.
   */

  def solve(lis: List[Int]): List[Int] = {
    lis match {
      case Nil => lis
      case (head :: tail) => solve(tail) ::: List(head)
    }
  }

  val lis = List(1,2,3,4,5,6)
  println(solve(lis))
}
