import scala.util.Random
import util.Random.nextInt

object Question7 extends App {

  /*
  Implemente uma função que gera um vetor de 20 posições com valores aleatórios
  inteiros variando de -100 a 300 (inclusive) e retorna o que se pede a seguir.
  Resolver usando filter/map/reduce.
  a. Quantos números estão no intervalo fechado de -12 a 55.
  b. Um Array que armazena a raiz quadrada dos números não-negativos. Os
  valores devem aparecer na mesma ordem do Array original.
  c. O maior valor dos números negativos.
  d. A soma dos divisores que não são próprios e nem são 1 dos números pares.
  Leia "a soma dos divisores que não são 1 e nem o próprio numero".
  */

  def gerador() = {
    Vector.fill(20)(Random.between(-100, 300))
  }

  def solveA(v:Vector[Int]): Vector[Int] = {
    v.filter(e => e >= -12 && e <= 55)
  }

  def raiz(a:Int):Double = {
    scala.math.sqrt(a)
  }

  def solveB(v:Vector[Int]): Vector[Double] = {
    v.map(raiz)
  }

  def solveC(v:Vector[Int]): Int = {
     v.filter(e => e < 0).max
  }

  val v = gerador()

  println("Initial: " + v + "\n")
  println("A)\n" + solveA(v))
  println("\nB)\n" + solveB(v))
  println("\nC)\n" + solveC(v))
}
