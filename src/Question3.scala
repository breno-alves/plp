object Question3 extends App{
  /*
  Implemente uma função que recebe um array e troca os valores de posições
  adjacentes. Por exemplo: Array(1, 2, 3, 4, 5, 6) resulta em Array(2, 1, 4, 3, 6, 5).
  Resolver usando recursão e pattern matching.
  */

  def solve(lis: List[Int], acc: List[Int]): List[Int] = lis match {
    case Nil => acc
    case lis if lis.length >= 2 => solve(lis.tail.tail, lis.head::lis.tail.head::acc)
    case lis if lis.length < 2 => solve(lis.tail, lis.head::acc)
  }

  val lis = List[Int](1, 2, 3, 4, 5, 6)

  println(solve(lis.reverse, List()))
}
