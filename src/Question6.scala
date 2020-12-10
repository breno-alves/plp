object Question6 extends App {
  /*
  * Implemente uma função que recebe um array de inteiros e indica quantos elementos
  * do array são múltiplos de 6 e não são múltiplos de 7. Resolver usando
  * filter/map/reduce.
  *
  * Caso 1:
  *
  * Entrada:
  * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21
  *
  * Saida:
  * 3
  */

  def solver(lis:List[Int]): Int = {
    val ans = lis.filter(e => e % 6 == 0 && e % 7 != 0)
    ans.length
  }

  val lis = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21)
  println(solver(lis))
}
