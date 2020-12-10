object Question5 extends App{
  /*
  * Implemente uma função que recebe um array e um valor N e indica se N ocorre
  * somente uma vez no array. Resolver usando recursão e pattern matching.
  *
  *
  * Caso 1:
  *
  * Entrada:
  * 1, 2, 3, 4, 5, 6, 7, 8, 3, 5
  * 3
  *
  * Saida:
  * true
  *
  * Caso 2:
  *
  * Entrada:
  * 1, 2, 3, 4, 5, 6, 7, 8, 3, 5
  * 8
  *
  * Saida:
  * false
  */

  def aux(lis: List[Int], target: Int, acc: List[Int]): List[Int] = lis match {
    case Nil => acc;
    case x if x.head == target => aux(lis.tail, target, x.head::acc)
    case _ => aux(lis.tail, target, acc)
  }

  def solver(lis: List[Int], target: Int): Boolean = {
    val ans = aux(lis, target, List())
    ans.length == 1
  }

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 3, 5)
  println(solver(list, 3))
  println(solver(list, 8))
}
