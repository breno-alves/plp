object Question9 extends App {
  /*
  * Implemente uma função que recebe 2 inteiros e calcula o MDC entre eles. Resolver
  usando recursão de cauda e pattern matching.
  * */
  def mdc(a: Int,b: Int): Int = {
     if(b ==0) a else mdc(b, a%b)
  }

  println(mdc(25,15))
}
