object Question2 extends App {
  /*
  Implemente uma função que recebe um inteiro N e um array de inteiros. A função
  deve retornar um novo array com os valores do array que são maiores que N.
  Resolver usando filter/map/reduce.

  caso 1:

  Entrada:
  1, 2, 3, 4, 5
  3

  Saida:
  List(4, 5)

   */

  def solver(l: List[Int], target: Int): List[Int] = {
    l.filter(e => e > target)
  }

  val list = List(1,2,3,4,5)
  print(solver(list, 3))
}
