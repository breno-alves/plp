object Question11 extends App {
  /*
  * 11. Implemente uma função que intercala dois arrays. (1, 2, 3, 4) (10, 20) ==> (1, 10, 2, 20, 3, 4).
  * Resolver usando recursão e pattern matching.
  * */

  def solve(a: List[Int], b: List[Int]): List[Int] = a match {
    case first :: rest => first :: solve(b, rest)
    case _ => b
  }

  val a = List(1, 2, 3, 4)
  val b = List(10, 20)

  print(solve(a, b))

}
