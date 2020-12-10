object Question10 extends App {
  /*
  * Implemente uma função que recebe uma string referente a um texto e retorna
  quantas palavras a redação possui e o número de ocorrências de cada letra do
  alfabeto. A função não deve diferenciar minúsculas e maiúsculas. Resolver usando
  filter/map/reduce.
  * */

  def list_elemnt_occurrences[A](list1:List[A]):Map[A, Int] = {
    list1.groupBy(el => el).map(e => (e._1, e._2.length))
  }

  def solve(texto: String): Unit = {
    val letters = list_elemnt_occurrences(texto.toList)
    val words = list_elemnt_occurrences(texto.split(' ').toList)
    println(letters + "\n" + words)
  }

  val texto = "alguma coisa aaaa bbbb ccc alguma coisa ssssss lol"

  solve(texto)
}
