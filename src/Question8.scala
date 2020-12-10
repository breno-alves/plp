object Question8 extends App {
  /*
  * Implemente uma função que calcula o fatorial de um dado número inteiro. Resolver
    usando recursão de cauda e pattern matching.
  * */

  def fact(n:Int): Int = {
    if(n == 1) 1
    else n * fact(n - 1)
  }

  println(fact(10))
}
