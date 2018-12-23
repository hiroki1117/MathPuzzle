package hiroki1117.mathpuzzle

object Q02 {
  /*
  数字の間に演算子を入れて計算を行う(演算子は最低一つは入れること）。
  その値が元の数を反対から並べた数字になるような数を探す。
  範囲は1000〜9999
   */

  def answer(from: Int, to: Int): Set[Int] = ???

  //文字列の式を評価する
  def calcExp(exp: String): Int = ???

  def insertOperator(num: Int): Seq[String] = {
    val operators = List("*", "+", "-", "|")
    val str = num.toString()
    val opeComb = duplicatePermutation(operators, str.length-1)
    for(ope_pare <- opeComb) yield {
      var i = 0
      str.foldLeft(""){(acc, el) =>
        if(i == str.length - 1) {
          acc + el
        } else {
          i += 1
          acc + el + ope_pare(i-1)
        }
      }
    }
  }

  //冪集合作る
  def duplicatePermutation[A](seq: Seq[A], len: Int): Seq[Seq[A]] = {
    if (len == 1) {
      seq.map(x => x :: Nil)
    } else {
      seq.flatMap(x => duplicatePermutation(seq, len-1).map(y => x +: y))
    }
  }
}
