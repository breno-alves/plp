object Question4 extends App {
  /*
  * Implemente uma função que calcula a média de um Array[Double]. Resolver usando
  * filter/map/reduce. Resolver usando recursão e pattern matching.
  *
  * Caso 1:
  * Entrada:
  * 1.5, 10.5, 22.3, 25.2
  *
  * Saida:
  * 14.875
  * */

  def solver(lista:List[Double]): Double = {
    val soma = lista.reduce((acc, element) => acc + element)
    soma / lista.length
  }

  val lis = List(1.5, 10.5, 22.3, 25.2)
  println(solver(lis))
}
