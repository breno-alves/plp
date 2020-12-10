object Question13 extends App {
  /*
  * Implemente uma função que verifica se uma string é palíndromo. Resolver usando
  recursão e pattern matching.
  * */

  def inverte[A](lis: List[A]): List[A] = {
    lis match {
      case Nil => lis
      case (head :: tail) => inverte(tail) ::: List(head)
    }
  }

  def solve(str: String): Boolean = {
    if (inverte(str.toList) == str.toList) {
      return true
    }
    false
  }

  val ex1 = "anna"
  val ex2 = "teste"

  println(solve(ex1))
  println(solve(ex2))

}
