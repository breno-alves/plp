object Question15 extends App {
  /*
  * Implemente uma função que ordena um array (de preferência usando a função
  anterior).
  * Resolver usando recursão e pattern matching.
  * */

  def appendinorder(lis: List[Int], n: Int): List[Int] = {
    lis match {
      case Nil => lis
      case head::Nil => List(head, n)
      case head::tail if (head < n && tail.head > n) => List(head, n):::tail
      case head::tail => head::appendinorder(tail, n)
    }
  }

  def solve(l1: List[Int], l2: List[Int]): List[Int] = {
    l1 match {
      case Nil => l2
      case head::Nil => solve(Nil, appendinorder(l2, head))
      case head::tail => solve(tail, appendinorder(l2, head))
    }
  }

  val lis = List(1,3,2,3,5,8,1)
  val list = List(1,2,3,4,5,6,8,9,10)
  //println(appendinorder(list,7))
  println(solve(lis, List()))
}
