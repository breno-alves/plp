import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
import scala.math.Ordered.orderingToOrdered
import scala.math.Ordering.Implicits.{infixOrderingOps, seqOrdering}

object Question14 extends App {
  /*
  * Implemente uma função que recebe um array já ordenado e um valor N, e retorna
  um array ordenado que inclui N. Resolver usando recursão e pattern matching.
  * */

  def solve(lis: List[Int], n: Int): List[Int] = {
    lis match {
      case Nil => List(n)
      case head::Nil if head >= n => List(n, head)
      case head::Nil if head < n => List(head, n)
      case head::tail if (head < n && tail.head > n) => List(head, n):::tail
      case head::tail => head::solve(tail, n)
    }
  }

  val lis = List(1,2,4,5,6)
  val n = 3
  println(solve(lis, 3))
}
