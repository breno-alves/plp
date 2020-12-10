object Question1 extends App {
  /*
  * Implemente uma função que recebe um array e um valor N e indica se N ocorre no
  * array. Observe que Array não precisa ser numérico. Resolver usando recursão e
  * pattern matching.
  *
  * Caso 1:
  *
  * Entrada:
  *   1, 2, 3, 4, 5, 6
  *   5
  * Saida:
  *   Sim
  * Caso 2:
  *
  * Entrada:
  *   1, 2, 3, 4, 5, 6
  *   8
  * Saida:
  *   Nao
  */

  def solver(xs: List[Int], target: Int): String = xs match {
    case x if x.length == 0 => "Nao"
    case x if x.head == target => "Sim"
    case _ => solver(xs.tail, target)
  }

  val list = List(1,2,3,4,5,6)

  println(solver(list, 5))
  println(solver(list, 8))
}
